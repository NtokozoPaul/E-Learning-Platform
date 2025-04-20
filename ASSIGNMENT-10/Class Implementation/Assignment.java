package com.elearning.model;

public class Assignment {
    private String title;
    private String dueDate;
    private boolean submitted;

    public Assignment(String title, String dueDate) {
        this.title = title;
        this.dueDate = dueDate;
        this.submitted = false;
    }

    public void submit() { this.submitted = true; }
    public boolean isSubmitted() { return submitted; }
    public String getTitle() { return title; }
    public String getDueDate() { return dueDate; }
}
