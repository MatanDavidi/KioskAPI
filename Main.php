<?php
use Classes\KioskAPI;
use Classes\Logger;
use Classes\UUID;
use Classes\Signature;

require_once __DIR__ . '/vendor/autoload.php';

$settings["app"]["deviceuuid"] = UUID::getRandomUUID();
$settings["logger"]["path"] = "tmp/KioskAPI.log";
$settings["logger"]["display"] = Logger::VISIBLE;

$ka = new KioskAPI($settings);
$languages = $ka->api->getLanguages();

var_dump($languages);