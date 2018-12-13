<?php
use Classes\KioskAPI;
use Classes\Logger;

require_once __DIR__ . '/vendor/autoload.php';

$settings["app"]["signature"] = "ciao";
$settings["app"]["deviceuuid"] = "ciao";
$settings["logger"]["path"] = "tmp/KioskAPI.log";
$settings["logger"]["display"] = Logger::VISIBLE;

$ka = new KioskAPI($settings);
