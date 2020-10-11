<?php


error_reporting(0);
set_time_limit(0);
error_reporting(0);
date_default_timezone_set('America/Buenos_Aires');

$detail = file_get_contents('https://randomuser.me/api/1.2/?nat=IN');
preg_match_all("(\"first\":\"(.*)\")siU", $detail, $value);
$name = $value[1][0];
preg_match_all("(\"last\":\"(.*)\")siU", $detail, $value);
$last = $value[1][0];
preg_match_all("(\"email\":\"(.*)\")siU", $detail, $value);
$email = $value[1][0];
preg_match_all("(\"street\":\"(.*)\")siU", $detail, $value);
$street = $value[1][0];
preg_match_all("(\"city\":\"(.*)\")siU", $detail, $value);
$city = $value[1][0];
preg_match_all("(\"state\":\"(.*)\")siU", $detail, $value);
$state = $value[1][0];
preg_match_all("(\"phone\":\"(.*)\")siU", $detail, $value);
$phone = $value[1][0];
preg_match_all("(\"postcode\":(.*),\")siU", $detail, $value);
$postcode = $value[1][0];
 

  $result = "<b>Full Name</b> : <code>$name  $last </code><b>Street</b> : <code>$street</code><b> Email :</b><code>$email</code><b> City :</b><code>$city</code><b> State : </b><code>$state</code><b> Phone : </b><code> $phone</code><b> Postcode : </b>$postcode</b>";
  echo $result;



?>
