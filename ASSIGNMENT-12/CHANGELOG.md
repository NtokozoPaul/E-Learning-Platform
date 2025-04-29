# 📦 Changelog – Assignment 12: Service Layer & REST API

## [1.0.0] – 2025-04-29

### 🎯 Added
- Service Layer: `UserService`, `CourseService`, `AssignmentService`
- In-memory repositories for all three entities
- FastAPI REST endpoints:
  - `/api/users`
  - `/api/courses`
  - `/api/assignments`
- Swagger/OpenAPI auto-generated docs (`/docs`)
- Unit tests for service logic
- Integration tests for API routes
- Screenshot instructions for API documentation

### 🛠️ Fixed
- 404 responses for missing entities
- Basic input validation for service layer

### 📌 Notes
- System is modular and testable
- Ready for future integration with database or authentication
