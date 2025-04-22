
package repositories.inmemory;

import repositories.UserRepository;
import com.elearning.model.User;
import java.util.*;

public class InMemoryUserRepository implements UserRepository {
    private final Map<String, User> storage = new HashMap<>();

    @Override
    public void save(User user) {
        storage.put(user.getEmail(), user);  // Use email as ID
    }

    @Override
    public Optional<User> findById(String email) {
        return Optional.ofNullable(storage.get(email));
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String email) {
        storage.remove(email);
    }
}
