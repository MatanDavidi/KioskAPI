<?php
namespace Classes;

date_default_timezone_set('UTC');

class KioskAPI
{
    private $deviceuuid;

    private $userId;

    private $logger;

    public $api;

    public function getDeviceUUID()
    {
        return $this->deviceuuid;
    }

    public function getLogger()
    {
        return $this->logger;
    }

    public function getUserId()
    {
        return $this->userId;
    }

    public function setUserId($userId)
    {
        $this->userId = $userId;
    }

    public function __construct($settings)
    {
        $this->loadSettings($settings);
    }

    public function loadSettings($settings)
    {
        $logFile = date("y_m_d_h_i_s") . "log";
        $display = Logger::HIDDEN;
        if (isset($settings["logger"])) {
            if (isset($settings["logger"]["path"])) {
                $logFile = $settings["logger"]["path"];
            }
            if (isset($settings["logger"]["display"])) {
                $display = $settings["logger"]["display"];
            }
        }
        $this->logger = new Logger($logFile, $display);
        if (isset($settings["logger"]["displaylength"])) {
            $this->logger->setDisplayLength($settings["logger"]["displaylength"]);
        }
        if (isset($settings["app"]["deviceuuid"])) {
            $this->deviceuuid = $settings["app"]["deviceuuid"];
            $this->logger->log("DeviceUUID: " . $settings["app"]["deviceuuid"]);
        }
        $this->logger->log("KioskAPI initialized.");
        $this->api = new Api($this);
    }

    public function save()
    {
        $userId = $this->userId;
        $data = json_encode($this->api->getUser($userId));
        if (!file_exists("sessions")) {
            mkdir("sessions");
        }
        file_put_contents("sessions/".$userId.".json", $data);
        $this->logger->log("Session saved to sessions/".$userId.".json");
    }

    public function load($path)
    {
        $data = json_decode(file_get_contents($path), true);
        $this->userId = $data["UserId"];
        $this->deviceuuid = $data["DeviceId"];
        $this->logger->log("Session loaded from $path");
        $this->logger->log("DeviceUUID: " . $this->deviceuuid);
        $this->logger->log("UserId: " . $this->userId);
    }
}
