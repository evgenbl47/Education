package org.example.module6_oop.class_user;

public class User {
    String username;
    String email;
    int age;
    boolean isActive;

    void printUserInfo() {
        System.out.println("username=" + username);
        System.out.println("email=" + email);
        System.out.println("age=" + age);
        System.out.println("isActive=" + isActive);
        System.out.println("Is adult: " + isAdult());
    }

    boolean isAdult() {
        return age >= 18;
    }
}
