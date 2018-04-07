--TEST--
Mongodb Connect phpt test
--FILE--
<?php 
require "load.php";
// Start Connect Call
$test = new Connect();
$test->setUpConnection();
// End Connect Call
?>
--EXPECT--
manager setup
