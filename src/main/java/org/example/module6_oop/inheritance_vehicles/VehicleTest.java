package org.example.module6_oop.inheritance_vehicles;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Unknown", 100, 1000);
        Vehicle car = new Car("Toyota", 200, 1500, 4, true);
        Vehicle bike = new Bike("Giant", 30, 15, true, 26);
        Vehicle truck = new Truck("Volvo", 90, 5000, 10000, 3);

        System.out.println("=== Creating Vehicles ===\n");

        Vehicle[] vehicles = {vehicle, car, bike, truck};

        for (Vehicle v : vehicles) {
            v.showInfo();
            v.move();
        }

        System.out.println("\n=== Type Check (instanceof) ===");
        System.out.println("Car is Vehicle? " + (car instanceof Vehicle));
        System.out.println("Bike is Vehicle? " + (bike instanceof Vehicle));
        System.out.println("Truck is Vehicle? " + (truck instanceof Vehicle));

        System.out.println("\n=== Specific Methods ===");
        for (Vehicle v : vehicles) {
            if (v instanceof Car) {
                Car c = (Car) v;
                c.openTrunk();
            }

            if (v instanceof Bike) {
                Bike b = (Bike) v;
                b.ringBell();
            }

            if (v instanceof Truck) {
                Truck t = (Truck) v;
                t.loadCargo();
            }
        }

        System.out.println("\n=== Cargo Check ===");
        System.out.println("Car can carry cargo? " + ((Car) car).canCarryCargo());
        System.out.println("Truck can carry cargo? " + ((Truck) truck).canCarryCargo());
    }
}
