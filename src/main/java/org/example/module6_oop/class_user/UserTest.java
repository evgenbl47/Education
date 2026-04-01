package org.example.module6_oop.class_user;

public class UserTest {
    public static void main(String[] args) {
        User user1 = new User();
        user1.username = "user1";
        user1.email = "user1@mail.ua";
        user1.age = 12;
        user1.isActive = false;

        System.out.println("=== User 1 Info ===");
        user1.printUserInfo();

        System.out.println();

        User user2 = new User();
        user2.username = "user2";
        user2.email = "user2@mail.ua";
        user2.age = 20;
        user2.isActive = true;

        System.out.println("=== User 2 Info ===");
        user2.printUserInfo();

    }
}
