from fastapi import APIRouter, HTTPException
from models.course import Course
from services.course_service import CourseService
from repositories.course_repository import CourseRepository

router = APIRouter()
course_service = CourseService(CourseRepository())

@router.post("/courses", response_model=Course)
def create_course(course: Course):
    return course_service.create_course(course)

@router.get("/courses/{course_id}", response_model=Course)
def get_course(course_id: str):
    try:
        return course_service.get_course(course_id)
    except ValueError as e:
        raise HTTPException(status_code=404, detail=str(e))

@router.get("/courses", response_model=list[Course])
def get_all_courses():
    return course_service.get_all_courses()

@router.delete("/courses/{course_id}")
def delete_course(course_id: str):
    course_service.delete_course(course_id)
    return {"message": f"Course {course_id} deleted."}
