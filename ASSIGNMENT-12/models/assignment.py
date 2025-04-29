from pydantic import BaseModel

class Assignment(BaseModel):
    id: str
    course_id: str
    title: str
    description: str
