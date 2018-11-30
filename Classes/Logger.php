<?php
namespace Classes;

class Logger {

  private $logFile;

  public function __construct($logFile){
    $this->logFile = $logFile;
  }

  public function log($text){
    $date = date("[H:i:s d/m/y]", time());
    file_put_contents($this->logFile, $date." ".$text."\n");
  }

}


?>
