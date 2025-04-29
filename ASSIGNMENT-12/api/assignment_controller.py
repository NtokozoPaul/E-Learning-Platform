from fastapi import APIRouter, HTTPException
from models.assignment import Assignment
from services.assignment_service import AssignmentService
from repositories.assignment_repository import AssignmentRepository

router = APIRouter()
assignment_service = AssignmentService(AssignmentRepository())

@router.post("/assignments", response_model=Assignment)
def create_assignment(assignment: Assignment):
    return assignment_service.create_assignment(assignment)

@router.get("/assignments/{assignment_id}", response_model=Assignment)
def get_assignment(assignment_id: str):
    try:
        return assignment_service.get_assignment(assignment_id)
    except ValueError as e:
        raise HTTPException(status_code=404, detail=str(e))

@router.get("/assignments", response_model=list[Assignment])
def get_all_assignments():
    return assignment_service.get_all_assignments()

@router.delete("/assignments/{assignment_id}")
def delete_assignment(assignment_id: str):
    assignment_service.delete_assignment(assignment_id)
    return {"message": f"Assignment {assignment_id} deleted."}
