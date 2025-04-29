from repositories.user_repository import UserRepository
from models.user import User

class UserService:
    def __init__(self, user_repo: UserRepository):
        self.user_repo = user_repo

    def create_user(self, user: User) -> User:
        # Add business logic here (e.g., validate email)
        return self.user_repo.save(user)

    def get_user(self, user_id: str) -> User:
        user = self.user_repo.find_by_id(user_id)
        if not user:
            raise ValueError(f"User with id {user_id} not found.")
        return user

    def get_all_users(self):
        return self.user_repo.find_all()

    def delete_user(self, user_id: str):
        return self.user_repo.delete(user_id)
