<?php
namespace Classes;

class KioskAPI {

  private $signature;

  private $deviceid;

  public function __construct($signature, $deviceid){
    $this->signature = $signature;
    $this->deviceid = $deviceid;
  }
}


?>
