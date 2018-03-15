package guides.examples.crud;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Connect {

    //Start Connect
    public static MongoClient getConnection() {

        //uri format: mongodb://[user]:[password]@[host]:[port]/[dbname]?authSource=[authDB]
        final String uriString = "mongodb://testuser:password@localhost:27017/test?authSourc e=admin";
        
        MongoClientURI uri = new MongoClientURI(uriString);
        // note that java connections are lazy and not initialized unless an operation such as a
        // find() or count() is executed
        return new MongoClient(uri);

    }
    //End Connect
}