package org.example.module6_oop.inheritance_animals;

public class Animal {
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getType() {
        return "Animal";
    }

    public void makeSound() {
        System.out.println("Some animal sound");
    }

    public void showInfo() {
        System.out.println("Animal name: " + name +
                ", age: " + age +
                ", color: " + color);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
