package org.example.module6_oop.inheritance_vehicles;

public class Bike extends Vehicle {

    private boolean hasBasket;
    private int wheelSize;

    public Bike(String brand, int maxSpeed, double weight, boolean hasBasket, int wheelSize) {
        super(brand, maxSpeed, weight);
        this.hasBasket = hasBasket;
        this.wheelSize = wheelSize;
    }

    @Override
    public String getType() {
        return "Bike";
    }

    @Override
    public void move() {
        System.out.println("🚲 Bike is pedaling...");
    }

    @Override
    public void showInfo() {
        System.out.println("Bike: "+brand+
                ", speed: "+maxSpeed+
                " km/h, weight: "+weight+
                " kg, basket: "+hasBasket+
                ", wheels: "+ wheelSize);
    }

    public void ringBell() {
        System.out.println("🔔 Bike bell rings!");
    }

    public boolean HasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }

    public int getWheelSize() {
        return wheelSize;
    }

    public void setWheelSize(int wheelSize) {
        if (wheelSize > 0) {
            this.wheelSize = wheelSize;
        } else {
            this.wheelSize = 26;
        }
    }
}
