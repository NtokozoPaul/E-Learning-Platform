package com.elearning.model;

public class Enrollment {
    private User student;
    private Course course;
    private String status;

    public Enrollment(User student, Course course) {
        this.student = student;
        this.course = course;
        this.status = "Enrolled";
    }

    public void dropCourse() { this.status = "Dropped"; }
    public String getStatus() { return status; }
    public Course getCourse() { return course; }
    public User getStudent() { return student; }
}
