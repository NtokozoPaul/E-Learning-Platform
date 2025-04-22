package repositories.inmemory;

import repositories.AdminRepository;
import com.elearning.model.Admin;

import java.util.*;

public class InMemoryAdminRepository implements AdminRepository {
    private final Map<String, Admin> storage = new HashMap<>();

    @Override
    public void save(Admin admin) {
        storage.put(admin.getEmail(), admin);
    }

    @Override
    public Optional<Admin> findById(String email) {
        return Optional.ofNullable(storage.get(email));
    }

    @Override
    public List<Admin> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String email) {
        storage.remove(email);
    }
}
