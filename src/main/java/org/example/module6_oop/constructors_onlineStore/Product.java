package org.example.module6_oop.constructors_onlineStore;

public class Product {

    // Поля:
    String name;
    double price;
    int quantity;
    boolean isAvailable;

    // Конструктор:
    public Product(String name, double price, int quantity, boolean isAvailable) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.isAvailable = isAvailable;

    }

    // Методы:
    void printProductInfo() {
        System.out.println("Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isAvailable=" + isAvailable +
                '}');
    }
    double getTotalValue() {
        return price * quantity;
    }

}
