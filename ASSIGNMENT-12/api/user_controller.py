from fastapi import APIRouter, HTTPException
from models.user import User
from services.user_service import UserService
from repositories.user_repository import UserRepository

router = APIRouter()
user_service = UserService(UserRepository())

@router.post("/users", response_model=User)
def create_user(user: User):
    return user_service.create_user(user)

@router.get("/users/{user_id}", response_model=User)
def get_user(user_id: str):
    try:
        return user_service.get_user(user_id)
    except ValueError as e:
        raise HTTPException(status_code=404, detail=str(e))

@router.get("/users", response_model=list[User])
def get_all_users():
    return user_service.get_all_users()

@router.delete("/users/{user_id}")
def delete_user(user_id: str):
    user_service.delete_user(user_id)
    return {"message": f"User {user_id} deleted."}
