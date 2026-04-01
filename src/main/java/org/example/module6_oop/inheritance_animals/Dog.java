package org.example.module6_oop.inheritance_animals;

public class Dog extends Animal {
    private String breed;
    private boolean isTrained;

    public Dog(String name, int age, String color, String breed, boolean isTrained) {
        super(name, age, color);
        this.breed = breed;
        this.isTrained = isTrained;
    }

    @Override
    public String getType() {
        return "Dog";
    }

    @Override
    public void makeSound() {
        System.out.println("🐕 Woof! Woof!");
    }

    @Override
    public void showInfo() {
        System.out.println("🐕 Dog: " + name +
                ", age: " + age +
                ", breed: " + breed +
                ", trained: " + isTrained);
    }

    public void fetch() {
        System.out.println("🎾 Dog brings the ball back!");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed == null || breed.trim().isEmpty()) {
            breed = "Unknown";
            return;
        }
        this.breed = breed;
    }

    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        this.isTrained = trained;
    }
}
