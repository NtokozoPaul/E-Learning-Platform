# 📡 Assignment 12: Service Layer & REST API – E-Learning Platform

This project implements service logic and RESTful endpoints for managing Users, Courses, and Assignments using FastAPI.

---

## 📁 Project Structure

---

## 🧠 Technologies

- FastAPI (REST framework)
- Pydantic (data validation)
- Python 3.10+
- Pytest (testing)

---

## 🔧 Key Features

### ✅ Service Layer
- `UserService`, `CourseService`, and `AssignmentService`
- Business logic for create, retrieve, and delete
- Validates inputs and raises exceptions

### ✅ REST API
- CRUD endpoints for all three entities
- Integrated with service and repository layers
- Auto-generated Swagger/OpenAPI docs

### ✅ Tests
- Unit tests for services
- API tests using FastAPI `TestClient`

---

## 📊 API Endpoints (examples)

| Method | Endpoint                  | Description              |
|--------|---------------------------|--------------------------|
| GET    | `/api/users`              | Get all users            |
| POST   | `/api/courses`            | Create a new course      |
| GET    | `/api/assignments/{id}`   | Retrieve one assignment  |
| DELETE | `/api/courses/{id}`       | Delete a course          |

Swagger UI is auto-generated at:  
👉 [`http://localhost:8000/docs`](http://localhost:8000/docs)

---

## 📸 API Documentation Screenshot

🖼️ Save a screenshot of `http://localhost:8000/docs` and place it in:  
📁 `docs/swagger_ui_screenshot.png`

---

## 🧪 Testing

```bash
pytest tests/

