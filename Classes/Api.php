<?php
namespace Classes;

use Classes\Logger;
use Classes\Signature;

/**
 * KioskApp API methods.
 */
class Api
{

    /**
     * Endpoint base url.
     */
    private $baseUrl = "https://kkiosk-ufeed.feeds.barcodes.no/";

    /**
     * Logger for the api class.
     */
    private $logger;

    /**
     * KioskAPI object.
     */
    private $kioskapi;

    /**
     * Constructor
     * @param object $kioskapi KioskAPI object.
     */
    public function __construct($kioskapi)
    {
        $this->kioskapi = $kioskapi;
        $this->logger = $kioskapi->getLogger();
        $this->logger->log("Api initialized with device uuid: " . $this->kioskapi->getDeviceUUID());
    }

    /**
     * HTTP Calls to endpoints.
     * @param string $endpoint the api endpoint.
     * @param array $signature a signature array.
     * @param boolean $post if the request must be post.
     * @param boolean $put if the request must be put.
     */
    private function request($endpoint, $signature, $post = null, $put = false)
    {
        $ch = curl_init();

        curl_setopt($ch, CURLOPT_URL, $this->baseUrl.$endpoint);
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($ch, CURLOPT_ENCODING, 'gzip, deflate');

        if ($post != null) {
            $post = json_encode($post);
            curl_setopt($ch, CURLOPT_POSTFIELDS, $post);
            if ($put) {
                curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'PUT');
            } else {
                curl_setopt($ch, CURLOPT_POST, 1);
            }
        }
        
        $headers = array();
        $headers[] = 'Host: kkiosk-ufeed.feeds.barcodes.no';
        $headers[] = 'Accept: */*';
        $headers[] = 'Content-Type: application/json';
        $headers[] = 'Accept-Language: de-ch';
        $headers[] = 'X-Liquid-Timestamp: '.$signature["date"];
        $headers[] = 'User-Agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0';
        $headers[] = 'X-Liquid-Signature: '.$signature["signature"];
        curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);

        $result = curl_exec($ch);
        curl_close($ch);

        $this->logger->log(__CLASS__ . " " . __FUNCTION__ . " " . $result);
        return json_decode($result, true);
    }

    /**
     * Get avaiable languages.
     * @return array
     */
    public function getLanguages()
    {
        $signature = Signature::getSignature('');
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("v1/Languages?", $signature);
        return $result;
    }

    /**
     * Create a temporary user.
     * @return array
     */
    public function initialize()
    {
        $signature = Signature::getSignature($this->kioskapi->getDeviceUUID());
        $post = array(
            "Culture" => "de-CH",
            "DeviceId" => $this->kioskapi->getDeviceUUID()
        );
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("v1/initialize", $signature, $post);
        $this->kioskapi->setUserId($result["UserId"]);
        return $result;
    }

    /**
     * Request phone pin.
     * @param string $phone the telephone to which the pin is to be sent without +.
     * @param string $userId default current user. 
     * @return array
     */
    public function requestPin($phone, $userId = "")
    {
        if (empty($userId)) {
            $userId = $this->kioskapi->getUserId();
        }
        $signature = Signature::getSignature($userId.$phone);
        $post = array(
            "MSN" => $phone,
            "UserID" => $userId
        );
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("v1/pin", $signature, $post);
        return $result;
    }

    /**
     * Register an account.
     * @param integer $pin the code.
     * @param string $birthdate the birthdate.
     * @param string $userId default current user. 
     * @return array
     */
    public function register($pin, $birthdate, $userId = "")
    {
        if (empty($userId)) {
            $userId = $this->kioskapi->getUserId();
        }
        $signature = Signature::getSignature($userId.$pin);
        $post = array(
            "DateOfBirth" => $birthdate,
            "Pin" => $pin,
            "ApprovedConsents" => [543],
            "RevokedConsents" => [],
            "UserID" => $userId
        );
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("v1/user", $signature, $post);
        if (isset($result["UserId"])) {
            $this->kioskapi->setUserId($result["UserId"]);
        }
        return $result;
    }

    /**
     * Edit account informations.
     * @param string $name the name.
     * @param string $gender the gender.
     * @param string $birthdate the birthdate.
     * @param string $culture the culture.
     * @param string $userId default current user. 
     * @return array
     */
    public function updateUser($name, $gender, $birthdate, $culture, $userId = "")
    {
        if (empty($userId)) {
            $userId = $this->kioskapi->getUserId();
        }
        $signature = Signature::getSignature($userId);
        $put = array(
            "DateOfBirth" => $birthdate,
            "Culture" => $culture,
            "Name" => $name,
            "Gender" => $gender,
            "ApprovedConsents" => [543],
            "RevokedConsents" => [502,837],
            "UserID" => $userId,
            "UserGroups" => [
                array(
                    "GroupId" => "Tabak-Aktionen",
                    "IsUserMember" => "true",
                    "UserCode" => ""
                )
            ]
        );
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("v1/user", $signature, $put, true);
        $this->kioskapi->setUserId($result["UserId"]);
        return $result;
    }

    /**
     * Get account coupons.
     * @param string $userId default current user. 
     * @return array
     */
    public function getCoupons($userId = "")
    {
        if (empty($userId)) {
            $userId = $this->kioskapi->getUserId();
        }
        $signature = Signature::getSignature($userId);
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $res = $this->request("v1/content?UserID=".$userId, $signature);
        $result["rewards"] = $res["Sections"][2]["Content"];
        $result["offers"] = $res["Sections"][3]["Content"];
        $result["coupons"] = $res["Sections"][0]["Content"];
        $result["loyalty"] = $res["Sections"][1]["Content"];
        return $result;
    }

    /**
     * Share a coupon.
     * @param string $couponId the coupon id.
     * @param string $scheduleId the coupon schedule id.
     * @param string $phone the receiver phone.
     * @return array 
     */
    public function shareCoupon($couponId, $scheduleId, $phone)
    {
        $signature = Signature::getSignature($this->kioskapi->getUserId().$couponId);
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $post = array(
            "UserId" => $this->kioskapi->getUserId(),
            "ScheduleId" => $scheduleId,
            "ContentId" => $couponId,
            "FriendUserRef" => $phone
        );
        $result = $this->request("/v1/share", $signature, $post);
        return $result;
    }

    /**
     * Get user informations.
     * @param string $userId default current user. 
     * @return array 
     */
    public function getUser($userId = "")
    {
        if (empty($userId)) {
            $userId = $this->kioskapi->getUserId();
        }
        $signature = Signature::getSignature($userId);
        $this->logger->log(__CLASS__ . " " . __FUNCTION__);
        $result = $this->request("/v1/user?UserID=".$userId, $signature);
        return $result;
    }
}
