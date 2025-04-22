package repositories.inmemory;

import repositories.NotificationRepository;
import com.elearning.model.Notification;
import java.util.*;

public class InMemoryNotificationRepository implements NotificationRepository {
    private final Map<String, Notification> storage = new HashMap<>();

    @Override
    public void save(Notification notification) {
        String id = notification.getRecipient().getEmail() + "_" + notification.hashCode();
        storage.put(id, notification);
    }

    @Override
    public Optional<Notification> findById(String id) {
        return Optional.ofNullable(storage.get(id));
    }

    @Override
    public List<Notification> findAll() {
        return new ArrayList<>(storage.values());
    }

    @Override
    public void delete(String id) {
        storage.remove(id);
    }
}
