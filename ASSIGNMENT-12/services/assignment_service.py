from repositories.assignment_repository import AssignmentRepository
from models.assignment import Assignment

class AssignmentService:
    def __init__(self, assignment_repo: AssignmentRepository):
        self.assignment_repo = assignment_repo

    def create_assignment(self, assignment: Assignment) -> Assignment:
        return self.assignment_repo.save(assignment)

    def get_assignment(self, assignment_id: str) -> Assignment:
        assignment = self.assignment_repo.find_by_id(assignment_id)
        if not assignment:
            raise ValueError(f"Assignment with id {assignment_id} not found.")
        return assignment

    def get_all_assignments(self):
        return self.assignment_repo.find_all()

    def delete_assignment(self, assignment_id: str):
        return self.assignment_repo.delete(assignment_id)
