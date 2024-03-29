<?php
namespace Classes;

class Logger
{
    private $logFile;
    private $display;
    private $displayLength;
    const HIDDEN = 0;
    const VISIBLE = 1;
    public function setDisplayLength($displayLength)
    {
        $this->displayLength = $displayLength;
    }
    public function __construct($logFile, $display = 0)
    {
        $this->logFile = $logFile;
        $this->display = $display;
    }
    public function log($text)
    {
        $date = date("[H:i:s d/m/y]", time());
        $text = $date." ".$text;
        if ($this->display == self::VISIBLE) {
            $delimiter = "\n";
            if (php_sapi_name() !== 'cli') {
                $delimiter = "<br>";
                $text = htmlspecialchars($text);
            };
            if (is_numeric($this->displayLength)) {
                echo substr($text, 0, $this->displayLength).$delimiter;
            } else {
                echo $text.$delimiter;
            }
        }
        file_put_contents($this->logFile, $text."\n", FILE_APPEND);
    }
}
