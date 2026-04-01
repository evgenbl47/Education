package org.example.module6_oop.inheritance_vehicles;

public class Truck extends Vehicle {

    private int cargoCapacity;
    private int axles;

    public Truck(String brand, int maxSpeed, double weight, int cargoCapacity, int axles) {
        super(brand, maxSpeed, weight);
        this.cargoCapacity = cargoCapacity;
        this.axles = axles;
    }

    @Override
    public String getType() {
        return "Truck";
    }

    @Override
    public void move() {
        System.out.println("🚚 Truck is hauling cargo...");
    }

    @Override
    public void showInfo() {
        System.out.println("🚚 Truck: " + brand +
                ", speed: " + maxSpeed +
                " km/h, weight: " + weight +
                " kg, cargo capacity: " + cargoCapacity +
                ", axles: " + axles);
    }

    public void loadCargo() {
        System.out.println("📦 Truck loading cargo...");
    }

    public boolean canCarryCargo() {
        return cargoCapacity > 0;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        if (cargoCapacity > 0) {
            this.cargoCapacity = cargoCapacity;
        } else {
            this.cargoCapacity = 100;
        }
    }

    public int getAxles() {
        return axles;
    }

    public void setAxles(int axles) {
        if (axles > 0) {
            this.axles = axles;
        } else {
            this.axles = 2;
        }
    }
}
