<?php
namespace Classes;
date_default_timezone_set('UTC');

class KioskAPI
{
    private $deviceuuid;

    private $logger;

    public $api;

    public function getDeviceUUID() {
        return $this->deviceuuid;
    }

    public function getLogger() {
        return $this->logger;
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
        if (isset($settings["app"]["deviceuuid"])) {
            $this->deviceuuid = $settings["app"]["deviceuuid"];
            $this->logger->log("DeviceUUID: " . $settings["app"]["deviceuuid"]);
        }
        $this->logger->log("KioskAPI initialized.");
        $this->api = new Api($this);

    }
}
