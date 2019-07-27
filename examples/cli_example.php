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
    $initialize = $ka->api->initialize();

    $pin = $ka->api->requestPin(readLine("Phone number (without +): "));

    $register["ResponseStatus"]["ErrorCode"] = "12";
    while (isset($register["ResponseStatus"]["ErrorCode"])) {
        $register = $ka->api->register(readLine("Pin: "), "1980-01-01");
    }
}
while (true) {
    echo "Index\tMethod name\n";
    $methods = get_class_methods($ka->api);
    for ($x = 0; $x < count($methods); $x++) {
        $method = $methods[$x];
        if ($method == "__construct") {
            continue;
        }
        $r = new ReflectionMethod($ka->api, $method);
        $params = $r->getParameters();
        echo $x."\t".$method."(";
        for ($i = 0; $i < count($params); $i++) {
            $param = $params[$i];
            echo $param->getName();
            if ($param->isOptional()) {
                echo '=""';
            }
            if ($i != count($params) - 1) {
                echo ", ";
            }
        }
        echo ")\n";
    }
    $index = readLine("Select a method: ");
    if (isset($methods[$index])) {
        $method = $methods[$index];
        $r = new ReflectionMethod($ka->api, $method);
        $params = $r->getParameters();
        $args = [];
        foreach ($params as $param) {
            $args[] = readline($param->getName().": ");
        }
        $save = readLine("Save output to a file? y/n: ");
        $result = call_user_func_array(array($ka->api, $method), $args);
        if (strtolower($save) != "n") {
            if (!file_exists("output")) {
                mkdir("output");
            }
            $path = "output/$method.json";
            file_put_contents($path, json_encode($result));
            echo "Saved to $path\n";
        }
    } else {
        break;
    }
}

$ka->save();
