<?php

use Classes\KioskAPI;
use Classes\Logger;
use Classes\UUID;
use Classes\Signature;

require_once __DIR__ . '/../vendor/autoload.php';

$settings["app"]["deviceuuid"] = UUID::getRandomUUID();
$settings["logger"]["path"] = "KioskAPI.log";
$settings["logger"]["display"] = Logger::VISIBLE;
$settings["logger"]["displaylength"] = 255;

$ka = new KioskAPI($settings);

$msn = readline("MSN: ");
$files = glob("sessions/*.json");
foreach($files as $file) {
    echo "Loading $file\n";
    $ka->load($file);
    $coupons = $ka->api->getCoupons();
    $offers = $coupons["offers"];
    foreach($offers as $offer) {
        echo json_encode($offer)."\n";
        if($offer["ShareType"] == "Shareable") {
            $contentId = $offer["ContentId"];
            $scheduleId = $offer["ScheduleId"];
            $result = $ka->api->shareCoupon($contentId, $scheduleId, $msn);
            var_dump($result);
        }
    }
}