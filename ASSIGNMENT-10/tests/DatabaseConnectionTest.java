package tests.singleton;

import org.junit.Test;
import static org.junit.Assert.*;
import creational_patterns.singleton.DatabaseConnection;

public class DatabaseConnectionTest {

    @Test
    public void testSingletonInstance() {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        assertSame(conn1, conn2);
    }
}
