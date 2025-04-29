from fastapi import FastAPI
from api import user_controller, course_controller, assignment_controller

app = FastAPI(title="E-Learning Platform API")

app.include_router(user_controller.router, prefix="/api")
app.include_router(course_controller.router, prefix="/api")
app.include_router(assignment_controller.router, prefix="/api")
