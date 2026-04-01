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

        House[] houses = {house, cottage, skyscraper};

        for (House h : houses) {
            h.showInfo();

            if (h instanceof Cottage) {
                Cottage c = (Cottage) h;
                c.plantTree();
            }
            if (h instanceof Skyscraper) {
                Skyscraper s = (Skyscraper) h;
                s.goToFloor(1);

            }

        }
    }

}
