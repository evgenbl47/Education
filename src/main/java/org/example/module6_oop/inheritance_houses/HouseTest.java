package org.example.module6_oop.inheritance_houses;

public class HouseTest {
    public static void main(String[] args) {
        // 1. Создать объекты (House, Cottage, Skyscraper)
        // 2. Массив House[] для демонстрации полиморфизма
        // 3. Цикл: вызвать showInfo() для каждого
        // 4. Проверка instanceof: вызвать plantTree() и goToFloor()


        House house = new House("Lenina 10", 50, 1990);
        House cottage = new Cottage("Forest 5", 120, 2020, true, 300);
        House skyscraper = new Skyscraper("Center 1", 5000, 2023, 50, true);

        System.out.println("=== Creating Objects ===");

        House[] buildings = {house, cottage, skyscraper};

        System.out.println("=== Polymorphism in Action ===");
        for (House h : buildings) {
            h.showInfo();
        }

        System.out.println("\n=== Type Check (instanceof) ===");
        System.out.println("Cottage is House? " + (cottage instanceof House));
        System.out.println("Skyscraper is House? " + (skyscraper instanceof House));
        System.out.println("Cottage is Skyscraper? " + (cottage instanceof Skyscraper));

            System.out.println("\n=== Specific Methods ===");
            if (cottage instanceof Cottage) {
                Cottage с = (Cottage) cottage;
                с.plantTree();
            }
            if (skyscraper instanceof Skyscraper) {
                ((Skyscraper) skyscraper).goToFloor(5);
//                skyscraper.goToFloor(1);

            }

    }

}
