<?php
namespace Classes;

use Classes\DateFormatter;

class Signature
{
    private static $chars = ['0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'];

    private static $secretkey = "so8#@xsMbkVFyvjV";

    private static function uRShift($a, $b)
    {
        if ($b == 0) {
            return $a;
        }
        return ($a >> $b) & ~(1<<(8*PHP_INT_SIZE-1)>>($b-1));
    }

    public static function getSignature($uuid)
    {
        $date = DateFormatter::getCurrentDate();
        $tohash = utf8_encode($date.$uuid.self::$secretkey);
        $hash = hash("sha256", $tohash, true);
        $length = strlen($hash);
        $signature = "";
        $i = 0;
        for ($i2 = 0; $i2 < $length; $i2++) {
            $i3 = $i + 1;
            $signature[$i] = self::$chars[self::uRShift((ord($hash[$i2]) & 240), 4)];
            $i = $i3 + 1;
            $signature[$i3] = self::$chars[ord($hash[$i2]) & 15];
        }
        return array("signature" => $signature, "date" => $date);
    }
}
