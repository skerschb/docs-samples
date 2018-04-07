package guides.examples.crud;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.mongodb.MongoClient;
import com.mongodb.MongoCollection;

public class ConnectTest {
    
    @Test
    void testConnection() {
        //Start Call Example 
        MongoClient mongoClient = Connect.getConnection();
        assertTrue(client!=null);
        Connect.closeConnection(client);
        //End Call Example
    }
   
    @Test
    void testCollectionBinding() {
        MongoClient mongoClient = Connection.getConnection();
        //Start Collection Bind
        MongoCollection collection = mongoClient.getCollection("inventory");
        //End Collection Bind
    }  
}
