package org.example.module6_oop.inheritance_animals;

public class Cat extends Animal {

    private boolean isIndoor;
    private int livesLeft;

    public Cat(String name, int age, String color, boolean isIndoor, int livesLeft) {
        super(name, age, color);
        this.isIndoor = isIndoor;
        this.livesLeft = livesLeft;
    }

    public void scratch() {
        System.out.println("🛋️ Cat scratches the furniture!");
    }

    @Override
    public String getType() {
        return "Cat";
    }

    @Override
    public void makeSound() {
        System.out.println("🐱 Meow! Meow!");
    }

    @Override
    public void showInfo() {
        System.out.println("🐱 Cat: " + name +
                ", age: " + age +
                ", indoor: " + isIndoor +
                ", lives: " + livesLeft);
    }


    public boolean isIndoor() {
        return isIndoor;
    }

    public void setIndoor(boolean indoor) {
        this.isIndoor = indoor;
    }

    public int getLivesLeft() {
            return livesLeft;
    }

    public void setLivesLeft(int livesLeft) {
        if (livesLeft >= 0 && livesLeft <=9) {
            this.livesLeft = livesLeft;
        }else livesLeft = 9;

    }
}
