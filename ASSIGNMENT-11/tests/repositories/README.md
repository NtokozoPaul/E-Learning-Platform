### 🔮 Future-Proofing the Repository Layer

The repository design supports easy switching of storage mechanisms. While the current implementation uses in-memory storage, the following stub is already added for future integration:

- `DatabaseUserRepository`: designed to connect to an SQL/NoSQL database in future releases.

This design ensures scalability and maintainability without requiring changes to the business logic.
