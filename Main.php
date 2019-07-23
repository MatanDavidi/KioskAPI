<?php
use Classes\KioskAPI;
use Classes\Logger;
use Classes\UUID;
use Classes\Signature;

require_once __DIR__ . '/vendor/autoload.php';

$settings["app"]["deviceuuid"] = UUID::getRandomUUID();
$settings["logger"]["path"] = "tmp/KioskAPI.log";
$settings["logger"]["display"] = Logger::VISIBLE;
$settings["logger"]["displaylength"] = 255;

$ka = new KioskAPI($settings);

$new = false;

if (file_exists("sessions")) {
    $files = glob("sessions/*.json");
    if (count($files) > 0) {
        echo "Avaiable sessions:\n";
        echo "Number\tUserId\n";
        for ($i = 0; $i < count($files); $i++) {
            echo "$i\t".$files[$i]."\n";
        }
        $index = readLine("Select a session (or press ENTER to create a new one): ");
        if (is_numeric($index)) {
            $session = $files[$index];
            $ka->load($session);
        } else {
            $new = true;
        }
    } else {
        $new = true;
    }
} else {
    $new = true;
}

if ($new) {
    $languages = $ka->api->getLanguages();

    $initialize = $ka->api->initialize();

    $pin = $ka->api->requestPin(readLine("Phone number: "));

    $register["ResponseStatus"]["ErrorCode"] = "12";
    while ($register["ResponseStatus"]["ErrorCode"] == 12) {
        $register = $ka->api->register(readLine("Pin: "), "1980-01-01");
    }

    $updated = $ka->api->updateUser("Test Test", "M", "1980-01-01", "de-CH");
}

$coupons = $ka->api->getCoupons();

$userInfo = $ka->api->getUser();

echo "UserId: ".$ka->getUserId()."\n";
echo "DeviceId: ".$ka->getDeviceUUID()."\n";

$ka->save();
