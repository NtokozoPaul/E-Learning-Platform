package factories;

import repositories.*;
import repositories.inmemory.*;

public class RepositoryFactory {

    public static UserRepository getUserRepository(String type) {
        switch (type.toUpperCase()) {
            case "MEMORY": return new InMemoryUserRepository();
            // case "DB": return new DatabaseUserRepository(); // future
            default: throw new IllegalArgumentException("Unsupported storage type: " + type);
        }
    }
}
