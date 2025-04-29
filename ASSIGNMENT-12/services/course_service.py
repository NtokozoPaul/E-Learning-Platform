from repositories.course_repository import CourseRepository
from models.course import Course

class CourseService:
    def __init__(self, course_repo: CourseRepository):
        self.course_repo = course_repo

    def create_course(self, course: Course) -> Course:
        return self.course_repo.save(course)

    def get_course(self, course_id: str) -> Course:
        course = self.course_repo.find_by_id(course_id)
        if not course:
            raise ValueError(f"Course with id {course_id} not found.")
        return course

    def get_all_courses(self):
        return self.course_repo.find_all()

    def delete_course(self, course_id: str):
        return self.course_repo.delete(course_id)
