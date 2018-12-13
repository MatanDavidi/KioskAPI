<?php
namespace Classes;

class Logger
{
    private $logFile;

    private $display;

    const HIDDEN = 0;

    const VISIBLE = 1;

    public function __construct($logFile, $display = 0)
    {
        $this->logFile = $logFile;
        $this->display = $display;
    }

    public function log($text)
    {
        $date = date("[H:i:s d/m/y]", time());
        $text = $date." ".$text."\n";
        if ($this->display == self::VISIBLE) {
            echo $text;
        }
        file_put_contents($this->logFile, $text, FILE_APPEND);
    }
}
