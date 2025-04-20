package com.elearning.model;

public class Course {
    private String title;
    private String description;
    private Instructor instructor;

    public Course(String title, String description, Instructor instructor) {
        this.title = title;
        this.description = description;
        this.instructor = instructor;
    }

    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public Instructor getInstructor() { return instructor; }
}
