package org.example.module6_oop.inheritance_vehicles;

public class Vehicle {
    protected String brand;
    protected int maxSpeed;
    protected double weight;

    public Vehicle(String brand, int maxSpeed, double weight) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
    }

    public String getType() {
        return "Vehicle";
    }

    public void move() {
        System.out.println("Vehicle is moving...");
    }

    public void showInfo() {
        System.out.println("Vehicle: "+brand+
                ", speed: "+maxSpeed+
                " km/h, weight: "+weight+" kg");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.trim().isEmpty()) {
            this.brand = "Unknown";
        } else {
            this.brand = brand;
        }
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 0 || maxSpeed > 300) {
            this.maxSpeed = 100;
        } else {
            this.maxSpeed = maxSpeed;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = 1000;
        } else {
            this.weight = weight;
        }
    }
}
