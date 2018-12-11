<?php
namespace Classes;

class DateFormatter
{

	private $offset;

	private $format = "Y-m-d\TH:i:s+";

	public function __construct($offset = "01:00") {
		$this->offset = $offset;
	}

	public function formatDate($time) {
		return date($this->format.$this->offset, $time);
	}


	public function getCurrentDate() {
		return date($this->format.$this->offset);
	}

}

?>