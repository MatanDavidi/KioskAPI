<?php
namespace Classes;

class KioskAPI
{

    private $signature;

    private $deviceuuid;

    private $logger;

    public function __construct($settings)
    {
        $this->loadSettings($settings);
    }

    public function loadSettings($settings)
    {
        $logFile = date("y_m_d_h_i_s") . "log";
        $display = 0;
        if (isset($settings["logger"])) {

            if (isset($settings["logger"]["path"])) {
                $logFile = $settings["logger"]["path"];
            }
            if (isset($settings["logger"]["display"])) {
                $display = $settings["logger"]["display"];
            }
        }
        $this->logger = new Logger($logFile, $display);
        if (isset($settings["app"]["signature"])) {
            $this->signature = $settings["app"]["signature"];
            $this->logger->log("Signature: " . $settings["app"]["signature"]);
        }
        if (isset($settings["app"]["deviceuuid"])) {
            $this->deviceuuid = $settings["app"]["deviceuuid"];
            $this->logger->log("DeviceUUID: " . $settings["app"]["deviceuuid"]);
        }
        $this->logger->log("KioskAPI initialized.");
    }
}


?>
