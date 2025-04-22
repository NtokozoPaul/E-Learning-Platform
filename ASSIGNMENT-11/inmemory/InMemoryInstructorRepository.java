package repositories.inmemory;

import repositories.InstructorRepository;
import com.elearning.model.Instructor;

import java.util.*;

public class InMemoryInstructorRepository implements InstructorRepository {
    private final Map<String, Instructor> storage = new HashMap<>();

    @Override
    public void save(Instructor instructor) {
        storage.put(instructor.getEmail(), instructor);
    }

    @Override
    public Optional<Instructor> findById(String email) {
        return Optional.ofNullable(storage.get(email));
    }

    @Override
    public List<Instructor> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String email) {
        storage.remove(email);
    }
}
