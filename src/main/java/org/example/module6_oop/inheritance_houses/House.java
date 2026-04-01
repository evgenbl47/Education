package org.example.module6_oop.inheritance_houses;

public class House {

    protected String address;      // protected — виден наследникам
    protected int square;
    protected int yearBuilt;

    public House(String address, int square, int yearBuilt) {
        this.address = address;
        this.square = square;
        this.yearBuilt = yearBuilt;
    }

    public String getType() {
        return "House";
    }

    public void showInfo() {
        System.out.println("Building: " + getType() + ",address: " + address + ", square: " + square + "sq.m, yearBuilt: " + yearBuilt);
    }

    @Override
    public String toString() {
        return "House [" +
                "address: " + address +
                ",\n    " +
                "square: " + square +
                ",\n    " +
                "yearBuilt: " + yearBuilt +
                "]";
    }

    public String getAddress() {
        return address;
    }

    public int getSquare() {
        return square;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }
}
