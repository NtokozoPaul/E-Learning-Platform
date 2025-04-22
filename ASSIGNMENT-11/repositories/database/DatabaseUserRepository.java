package repositories.database;

import com.elearning.model.User;
import repositories.UserRepository;

import java.util.*;

public class DatabaseUserRepository implements UserRepository {
    @Override
    public void save(User user) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public Optional<User> findById(String id) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public List<User> findAll() {
        throw new UnsupportedOperationException("Not yet implemented.");
    }

    @Override
    public void delete(String id) {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
}
