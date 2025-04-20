package com.elearning.model;

public class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void suspendUser(User user) {
        System.out.println("Admin suspended user: " + user.getName());
    }
}
