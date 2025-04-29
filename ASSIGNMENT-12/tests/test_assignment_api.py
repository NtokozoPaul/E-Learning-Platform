from fastapi.testclient import TestClient
from main import app

client = TestClient(app)

def test_create_assignment_api():
    response = client.post("/api/assignments", json={
        "id": "a2",
        "course_id": "c1",
        "title": "Assignment 1",
        "description": "Solve all questions"
    })
    assert response.status_code == 200
    assert response.json()["title"] == "Assignment 1"

def test_get_assignment_api():
    client.post("/api/assignments", json={
        "id": "a3",
        "course_id": "c1",
        "title": "Assignment 2",
        "description": "Write report"
    })
    response = client.get("/api/assignments/a3")
    assert response.status_code == 200
    assert response.json()["id"] == "a3"
