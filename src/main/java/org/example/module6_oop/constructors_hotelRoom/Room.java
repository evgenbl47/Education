package org.example.module6_oop.constructors_hotelRoom;

public class Room {
    int roomNumber; //Номер комнаты (101, 102, ...)
    String roomType; //Тип номера (Standard, Deluxe, Suite)
    double pricePerNight; //Цена за ночь в долларах
    boolean hasBreakFast; //Включён ли завтрак
    boolean hasSeaView; //Есть ли вид на море

    public Room(int roomNumber, String roomType, double pricePerNight, boolean hasBreakFast, boolean hasSeaView) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.pricePerNight = pricePerNight;
        this.hasBreakFast = hasBreakFast;
        this.hasSeaView = hasSeaView;
    }

    public Room(int roomNumber, String roomType, double pricePerNight) {
        this(roomNumber, roomType, pricePerNight, false, false);
    }

    public Room(int roomNumber) {
        this(roomNumber, "Standard", 25.99, false, false);
    }

    // Метод, который "апгрейдит" номер:
    // - Меняет roomType на "Suite"
    // - Увеличивает pricePerNight на 50%
    // - Возвращает this (для цепочки вызовов)
    public Room upgradeToSuite() {
        this.roomType = "Suite";
        this.pricePerNight = pricePerNight * 3;
        return this;
    }

    //Возвращает общую стоимость: pricePerNight * nights
    double calculateTotal(int nights) {
        return pricePerNight * nights;
    }

    //Выводит всю информацию о номере (на английском)
    void printRoomInfo() {
        System.out.println("roomNumber=" + roomNumber +
                ", roomType=" + roomType +
                ", pricePerNight=" + pricePerNight +
                ", hasBreakFast=" + hasBreakFast +
                ", hasSeaView=" + hasSeaView);
    }
}
