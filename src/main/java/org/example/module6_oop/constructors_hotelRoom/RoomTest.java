package org.example.module6_oop.constructors_hotelRoom;

public class RoomTest {
    public static void main(String[] args) {

        Room room1 = new Room(1, "Luxe", 99.99, true, true);
        Room room2 = new Room(2, "Deluxe", 50.99);
        Room room3 = new Room(3);

        System.out.println("=== Room 1 ===");
        room1.printRoomInfo();
        System.out.println("Total for 3 nights: $" + room1.calculateTotal(3));

        System.out.println("=== Room 2 ===");
        room2.printRoomInfo();
        System.out.println("Total for 3 nights: $" + room2.calculateTotal(3));

        System.out.println("=== Room 3 ===");
        room3.printRoomInfo();
        System.out.println("Total for 3 nights: $" + room3.calculateTotal(3));

        System.out.println("=== Room Upgrade ===");
        Room roomUpgrade = new Room(101).upgradeToSuite();
        roomUpgrade.printRoomInfo();
        System.out.println("Total for 3 nights: $" + roomUpgrade.calculateTotal(3));

    }

}
