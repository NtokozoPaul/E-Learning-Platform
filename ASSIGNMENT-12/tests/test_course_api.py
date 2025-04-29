from fastapi.testclient import TestClient
from main import app

client = TestClient(app)

def test_create_course_api():
    response = client.post("/api/courses", json={
        "id": "c2",
        "title": "Databases",
        "description": "Intro to DBs"
    })
    assert response.status_code == 200
    assert response.json()["title"] == "Databases"

def test_get_course_api():
    client.post("/api/courses", json={
        "id": "c3",
        "title": "Cloud Computing",
        "description": "Learn AWS"
    })
    response = client.get("/api/courses/c3")
    assert response.status_code == 200
    assert response.json()["id"] == "c3"
