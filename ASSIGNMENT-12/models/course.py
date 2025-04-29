from pydantic import BaseModel

class Course(BaseModel):
    id: str
    title: str
    description: str
