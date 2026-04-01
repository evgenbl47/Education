package org.example.module6_oop.inheritance_animals;

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 2, "white");
        Animal dog = new Dog("Gav", 1, "yellow", "simple", true);
        Animal cat = new Cat("Kitty", 3, "black", true, 9);

        System.out.println("=== Creating Pets ===");

        Animal[] animals = {animal, dog, cat};

        System.out.println("\n=== Polymorphism in Action ===");
        for (Animal a : animals) {
            a.showInfo();
            a.makeSound();
        }

        System.out.println("\n=== Type Check (instanceof) ===");
        System.out.println("Dog is Animal? " + (dog instanceof Animal));
        System.out.println("Cat is Animal? " + (cat instanceof Animal));
        System.out.println("Dog is Cat? " + (dog instanceof Cat));


        System.out.println("\n=== Specific Methods ===");
        for (Animal a : animals) {
            if (a instanceof Cat) {
                Cat c = (Cat) a;
                c.scratch();
            }

            if (a instanceof Dog) {
                Dog d = (Dog) a;
                d.fetch();
            }
        }

    }
}
