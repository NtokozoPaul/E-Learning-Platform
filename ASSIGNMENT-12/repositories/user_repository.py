from models.user import User
from typing import Dict, Optional

class UserRepository:
    def __init__(self):
        self.users: Dict[str, User] = {}

    def save(self, user: User) -> User:
        self.users[user.id] = user
        return user

    def find_by_id(self, user_id: str) -> Optional[User]:
        return self.users.get(user_id)

    def find_all(self):
        return list(self.users.values())

    def delete(self, user_id: str):
        return self.users.pop(user_id, None)
