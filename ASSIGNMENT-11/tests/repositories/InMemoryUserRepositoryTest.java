package tests.repositories;

import repositories.inmemory.InMemoryUserRepository;
import com.elearning.model.User;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class InMemoryUserRepositoryTest {

    @Test
    public void testSaveAndFind() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        User user = new User("Ntokozo", "ntokozo@example.com");
        repo.save(user);

        Optional<User> found = repo.findById("ntokozo@example.com");
        assertTrue(found.isPresent());
        assertEquals("Ntokozo", found.get().getName());
    }

    @Test
    public void testDelete() {
        InMemoryUserRepository repo = new InMemoryUserRepository();
        repo.save(new User("Ntokozo", "ntokozo@example.com"));
        repo.delete("ntokozo@example.com");
        assertFalse(repo.findById("ntokozo@example.com").isPresent());
    }
}
