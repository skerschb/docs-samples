package guides.examples.crud;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Connect {

    // Start Connect
    public static MongoClient getConnection() {

        // uri format:
        // mongodb://[user]:[password]@[host]:[port]/[dbname]?authSource=[authDB]
        final String uriString = "<URISTRING>";

        MongoClientURI uri = new MongoClientURI(uriString);
        // note that java connections are not initialized unless an operation
        // such as a find() or count() is executed
        return new MongoClient(uri);

    }
    // End Connect

    public static void closeConnection(MongoClient client) {
        client.close();
    }
}
