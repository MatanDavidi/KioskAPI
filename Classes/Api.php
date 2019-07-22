<?php
namespace Classes;
use Classes\Logger;
use Classes\Signature;

class Api {

    private $baseUrl = "https://kkiosk-ufeed.feeds.barcodes.no/";

    private $uuid;

    private $logger;

    public function __construct($kioskapi) {
        $this->uuid = $kioskapi->getDeviceUUID();
        $this->logger = $kioskapi->getLogger();
        $this->logger->log("Api initialized with device uuid: " . $this->uuid );
    }

    public function getLanguages() {
        $signatureinfo = Signature::getSignature('');
        $signature = $signatureinfo["signature"];
        $timestamp = $signatureinfo["date"];
        $ch = curl_init();
        curl_setopt($ch, CURLOPT_URL, $this->baseUrl.'v1/Languages?');
        curl_setopt($ch, CURLOPT_RETURNTRANSFER, 1);
        curl_setopt($ch, CURLOPT_CUSTOMREQUEST, 'GET');
        $headers = array();
        $headers[] = 'Host: kkiosk-ufeed.feeds.barcodes.no';
        $headers[] = 'Accept: */*';
        $headers[] = 'Content-Type: application/json';
        $headers[] = 'X-Liquid-Timestamp: '.$timestamp;
        $headers[] = 'User-Agent: K-Kiosk/437 CFNetwork/975.0.3 Darwin/18.2.0';
        $headers[] = 'X-Liquid-Signature: '.$signature;
        $headers[] = 'Accept-Language: de-ch';
        curl_setopt($ch, CURLOPT_HTTPHEADER, $headers);
        $result = curl_exec($ch);
        curl_close($ch);
        return json_decode($result, true);
    }

}

?>