<?php
namespace Classes;

class DateFormatter
{

    public static function getCurrentDate()
    {
        $micro_date = microtime();
        $date_array = explode(" ",$micro_date);
        $date = date("Y-m-d\TH:i:s",$date_array[1]).substr($date_array[0],1 ,4)."Z";
        return $date;
    }
}