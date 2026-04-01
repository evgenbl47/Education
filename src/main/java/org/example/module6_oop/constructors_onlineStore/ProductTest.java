package org.example.module6_oop.constructors_onlineStore;

public class ProductTest {

    public static void main(String[] args) {
        // Создать 2 объекта:
        Product product1 = new Product("Laptop", 999.99, 5, true);
        Product product2 = new Product("Mouse", 29.99, 0, false);

        // Для каждого:
        // 1. printProductInfo()
        // 2. getTotalValue() + вывод в консоль
        System.out.println("=== Product 1 ===");
        product1.printProductInfo();
        System.out.println("Total value: $" + product1.getTotalValue());


        System.out.println("=== Product 2 ===");
        product2.printProductInfo();
        System.out.println("Total value: $" + product2.getTotalValue());

    }
}
