package repositories.inmemory;

import repositories.CourseRepository;
import com.elearning.model.Course;
import java.util.*;

public class InMemoryCourseRepository implements CourseRepository {
    private final Map<String, Course> storage = new HashMap<>();

    @Override
    public void save(Course course) {
        storage.put(course.getTitle(), course);
    }

    @Override
    public Optional<Course> findById(String title) {
        return Optional.ofNullable(storage.get(title));
    }

    @Override
    public List<Course> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String title) {
        storage.remove(title);
    }
}
