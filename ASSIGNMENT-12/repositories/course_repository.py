from models.course import Course
from typing import Dict, Optional, List

class CourseRepository:
    def __init__(self):
        self._courses: Dict[str, Course] = {}

    def save(self, course: Course) -> Course:
        self._courses[course.id] = course
        return course

    def find_by_id(self, course_id: str) -> Optional[Course]:
        return self._courses.get(course_id)

    def find_all(self) -> List[Course]:
        return list(self._courses.values())

    def delete(self, course_id: str) -> Optional[Course]:
        return self._courses.pop(course_id, None)
