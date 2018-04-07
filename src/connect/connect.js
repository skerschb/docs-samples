//Start Connect
const MongoClient = require('mongodb').MongoClient;
const f = require('util').format;
const assert = require('assert');

const user = encodeURIComponent('testuser');
const password = encodeURIComponent('password');

// Connection URL
const url = f('mongodb://%s:%s@localhost:27017/test?authSource=admin', user, password);

// Use connect method to connect to the Server
MongoClient.connect(url, function(err, client) {
   
   console.log(url);
   
   assert.equal(null, err);
 
   console.log("Connected correctly to server");

   client.close();
});
//End Connect
