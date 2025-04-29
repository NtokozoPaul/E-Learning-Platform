from models.assignment import Assignment
from typing import Dict, Optional, List

class AssignmentRepository:
    def __init__(self):
        self._assignments: Dict[str, Assignment] = {}

    def save(self, assignment: Assignment) -> Assignment:
        self._assignments[assignment.id] = assignment
        return assignment

    def find_by_id(self, assignment_id: str) -> Optional[Assignment]:
        return self._assignments.get(assignment_id)

    def find_all(self) -> List[Assignment]:
        return list(self._assignments.values())

    def delete(self, assignment_id: str) -> Optional[Assignment]:
        return self._assignments.pop(assignment_id, None)
