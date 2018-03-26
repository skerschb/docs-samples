--TEST--
Mongodb Connect phpt test
--FILE--
<?php 
require "load.php";
$test = new Connect();
$test->setUpConnection();
?>
--EXPECT--
manager setup
