<?php
namespace Classes;

require_once __DIR__ . '/vendor/autoload.php';

$settings["app"]["signature"] = "ciao";
$settings["app"]["deviceuuid"] = "ciao";
$settings["logger"]["display"] = 1;

$ka = new KioskAPI($settings);
?>
