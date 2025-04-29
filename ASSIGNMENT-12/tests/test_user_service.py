from services.user_service import UserService
from repositories.user_repository import UserRepository
from models.user import User

def test_create_user():
    repo = UserRepository()
    service = UserService(repo)
    user = User(id="1", name="Alice", email="alice@example.com")
    created_user = service.create_user(user)
    assert created_user == user
