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
       $manager = new MongoDB\Driver\Manager("mongodb://testuser:password@localhost:27017/test?authSource=admin");
       echo 'manager setup';
    }
} 

//End Connect Example 
