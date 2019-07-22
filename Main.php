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

$initialize = $ka->api->initialize();
var_dump($initialize);

$tempUserId = $initialize["UserId"];

$pin = $ka->api->requestPin($tempUserId, "Phone number: ");

var_dump($pin);

$register["ResponseStatus"]["ErrorCode"] = "12";
while($register["ResponseStatus"]["ErrorCode"] == 12)
{
    $register = $ka->api->register($tempUserId, readLine("Pin: "), "1980-01-01");
    var_dump($register);
}
var_dump($register);

$userId = $register["UserId"];
$updated = $ka->api->registerUser($userId, "Test Test", "M", "1980-01-01", "de-CH");
var_dump($updated);

$coupons = $ka->api->getCoupons($userId);
var_dump($coupons);
