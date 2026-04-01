package org.example.module6_oop.inheritance_vehicles;

public class Car extends Vehicle {
    private int doors;
    private boolean hasAC;

    public Car(String brand, int maxSpeed, double weight, int doors, boolean hasAC) {
        super(brand, maxSpeed, weight);
        this.doors = doors;
        this.hasAC = hasAC;
    }

    @Override
    public String getType() {
        return "Car";
    }

    @Override
    public void move() {
        System.out.println("🚗 Car is driving on road...");
    }

    @Override
    public void showInfo() {
        System.out.println("Car: "+brand+
                ", speed: "+maxSpeed+
                " km/h, weight: "+weight+
                " kg, doors: "+doors+
                ", AC: "+ hasAC);
    }

    public void openTrunk() {
        System.out.println("🔓 Car trunk opened!");
    }

    public boolean canCarryCargo() {
        return doors >= 4;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        if (doors > 0) {
            this.doors = doors;
        } else {
            this.doors = 2;
        }
    }

    public boolean HasAC() {
        return hasAC;
    }

    public void setHasAC(boolean hasAC) {
        this.hasAC = hasAC;
    }
}
