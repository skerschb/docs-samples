package guides.examples.crud;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConnectTest {
    
    @Test
    void testConnection() {
        assertTrue(Connect.getConnection()!=null);
        System.out.println("*******RAN TEST******");
    }

}
