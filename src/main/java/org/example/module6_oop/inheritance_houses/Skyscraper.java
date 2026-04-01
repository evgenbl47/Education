package org.example.module6_oop.inheritance_houses;

public class Skyscraper extends House {

    private int floors;            // Количество этажей
    private boolean hasElevator;   // Есть ли лифт

    public Skyscraper(String address, int square, int yearBuilt, int floors, boolean hasElevator) {
        super(address, square, yearBuilt);
        this.floors = floors;
        this.hasElevator = hasElevator;
    }

    @Override
    public String getType() {
        return "Skyscraper";
    }

    @Override
    public void showInfo() {
        System.out.println("Building: " + getType() +
                ", address: " + address +
                ", square: " + square +
                "sq.m, yearBuilt: " + yearBuilt +
                ", floors: " + floors +
                ", hasElevator: " + hasElevator);
    }

    void goToFloor(int floor) {
        System.out.println("🛗 Elevator to floor N");
    }
}
