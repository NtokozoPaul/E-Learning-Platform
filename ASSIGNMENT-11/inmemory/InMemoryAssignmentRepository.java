package repositories.inmemory;

import repositories.AssignmentRepository;
import com.elearning.model.Assignment;
import java.util.*;

public class InMemoryAssignmentRepository implements AssignmentRepository {
    private final Map<String, Assignment> storage = new HashMap<>();

    @Override
    public void save(Assignment assignment) {
        storage.put(assignment.getTitle(), assignment);
    }

    @Override
    public Optional<Assignment> findById(String title) {
        return Optional.ofNullable(storage.get(title));
    }

    @Override
    public List<Assignment> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String title) {
        storage.remove(title);
    }
}
