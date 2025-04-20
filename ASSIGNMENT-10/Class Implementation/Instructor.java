package com.elearning.model;

public class Instructor extends User {
    public Instructor(String name, String email) {
        super(name, email);
    }

    public void createCourse(Course course) {
        System.out.println(getName() + " created the course: " + course.getTitle());
    }
}
