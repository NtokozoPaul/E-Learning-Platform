### 🏭 Repository Factory (Abstraction Layer)

The repository layer uses the Factory Pattern to switch between different storage types such as:

- `InMemoryUserRepository` for testing and speed
- `DatabaseUserRepository` (stubbed for future use)

This ensures loose coupling and allows swapping storage without modifying business logic.
