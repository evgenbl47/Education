package org.example;
public class Main {

    public static int calculateDiscount(int purchaseAmount) {
        int result = 0;
        if (purchaseAmount >= 10_000) {
            result = 20;
        } else if (purchaseAmount >= 5_000) {
            result = 10;
        } else if (purchaseAmount >= 1000) {
            result = 5;
        }

        return result;
    }
    public static void printDiscountInfo(int discount) {
        if (discount > 0) {
            System.out.println("Your discount: "+discount+"%");
        } else if (discount == 0) {
            System.out.println("No discount");
        }
    }

    public static boolean checkPasswordLength(String password) {
        if (password.length() >= 8) {
            return true;
        }

        return false;
    }
    public static boolean checkPasswordHasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public static void printValidationResult(boolean lengthOk, boolean hasDidgit) {
        if (lengthOk && hasDidgit) {
            System.out.println("Password is strong! ✅");
        } else {
            System.out.println("Password is weak! ❌");
        }
    }

    public static void main(String[] args) {
//        System.out.println("java".charAt(1));

        User user1 = new User();
        user1.username = "user1";
        user1.email = "user1@mail.ua";
        user1.age = 12;
        user1.isActive = false;
        user1.printUserInfo();
        user1.isAdult();

        User user2 = new User();
        user2.username = "user2";
        user2.email = "user2@mail.ua";
        user2.age = 12;
        user2.isActive = false;
        user2.printUserInfo();
        user2.isAdult();

    }

    static class User {
        String username;
        String email;
        int age;
        boolean isActive;

        void printUserInfo() {
            System.out.println("username=" + username);
            System.out.println("email=" + email);
            System.out.println("age=" + age);
            System.out.println("isActive=" + isActive);
        }

        boolean isAdult() {
            return age >= 18;
        }

    }
}