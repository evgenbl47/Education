package org.example.module6_oop.encapsulation_userAuth;

public class Test_User {
    public static void main(String[] args) {
        User user = new User("alex_dev", "alex@example.com", 25, "SecurePass123");

        System.out.println("\n=== User Info ===");
        user.printUserInfo();
        user.setAge(-5);

        System.out.println("\n=== Testing Setters with Validation ===");
        user.setPassword("123");
        user.setEmail("invalid");
        user.setUsername("ab");

        System.out.println("\n=== Getters Test ===");
        System.out.println("Username: " + user.getUsername());
        System.out.println("Age: " + user.getAge());

        System.out.println("\n=== Testing changePassword() ===");
// ✅ Успешная смена
        boolean result1 = user.changePassword("SecurePass123", "NewSecure456", "NewSecure456");
        System.out.println("Change result: " + result1);  // Ожидание: true

// ❌ Неверный старый пароль
        boolean result2 = user.changePassword("WrongPass", "AnotherPass123", "AnotherPass123");
        System.out.println("Change result: " + result2);  // Ожидание: false + ошибка

// ❌ Короткий новый пароль
        boolean result3 = user.changePassword("NewSecure456", "123", "123");
        System.out.println("Change result: " + result3);  // Ожидание: false + ошибка

// ❌ Пароли не совпадают
        boolean result4 = user.changePassword("NewSecure456", "FinalPass123", "DifferentPass");
        System.out.println("Change result: " + result4);  // Ожидание: false + ошибка

    }
}
