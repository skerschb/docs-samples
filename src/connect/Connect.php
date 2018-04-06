<?php
//Start Connect Example
use MongoDB\Database;
use MongoDB\Driver\Cursor;
use MongoDB\Driver\Server;
use MongoDB\Operation\DropCollection;
use MongoDB\Operation\DropDatabase;

class Connect {

    public function setUpConnection()
    {
       $manager = new MongoDB\Driver\Manager("<URISTRING>");
       echo 'manager setup';
    }
} 

//End Connect Example 
