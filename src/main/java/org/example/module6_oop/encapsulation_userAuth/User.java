package org.example.module6_oop.encapsulation_userAuth;

public class User {

    private String username;
    private String email;
    private int    age;
    private String password;

    public User(String username, String email, int age, String password) {
        this.username = username;
        this.email = email;
        this.age = age;
        this.password = password;
    }

    // Требует старый пароль + новый пароль + подтверждение нового
    public boolean changePassword(String oldPassword, String newPassword, String confirmNewPassword) {
        // Проверки:
        // 1. oldPassword == this.password
        // 2. newPassword.length() >= 8
        // 3. newPassword.equals(confirmNewPassword)
        // Если всё ок → обновить пароль и вернуть true
        // Если ошибка → вывести сообщение и вернуть false
        if (!oldPassword.equals(this.password)) {
            System.out.println("Error: Old password is incorrect!");
            return false;
        }
        if (newPassword.length() < 8) {
            System.out.println("Error: Password must be at least 8 characters!");
            return false;
        }
        if (!newPassword.equals(confirmNewPassword)) {
            System.out.println("Error: Passwords do not match!");
            return false;
        }
        this.password = newPassword;
        return true;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username.length() >= 3) {
            this.username = username;
        } else {
            System.out.println("Error: Username must be at least 3 characters!");
        }
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            System.out.println("Error: Invalid email format!");

        }
    }

    //         Содержит символ @
    private boolean isValidEmail(String email) {
        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i) == '@') {
                return true;
            }
        }
        return false;

    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            System.out.println("Error: Invalid age!");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Error: Password must be at least 8 characters!");
        }
    }

    void printUserInfo() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "User [" +
                "username: " + username +
                ",\n    " +
                "email: " + email +
                ",\n    " +
                "age: " + age +
                "]";
    }
}
