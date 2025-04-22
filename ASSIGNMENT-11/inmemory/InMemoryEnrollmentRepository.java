package repositories.inmemory;

import repositories.EnrollmentRepository;
import com.elearning.model.Enrollment;
import java.util.*;

public class InMemoryEnrollmentRepository implements EnrollmentRepository {
    private final Map<String, Enrollment> storage = new HashMap<>();

    @Override
    public void save(Enrollment enrollment) {
        String key = enrollment.getStudent().getEmail() + "_" + enrollment.getCourse().getTitle();
        storage.put(key, enrollment);
    }

    @Override
    public Optional<Enrollment> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Enrollment> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
