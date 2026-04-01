package org.example.module6_oop.inheritance_houses;

public class Cottage extends House {

    private boolean hasGarden;     // Есть ли сад
    private int gardenSize;        // Размер сада в м²

    // Конструктор (4 параметра + вызов super(...) первой строкой!)
    // Переопределить getType() → вернуть "Cottage"
    // Переопределить showInfo() → добавить информацию о саде
    // Метод: public void plantTree() — выводит "🌳 Дерево посажено в саду!"


    public Cottage(String address, int square, int yearBuilt, boolean hasGarden, int gardenSize) {
        super(address, square, yearBuilt);
        this.hasGarden = hasGarden;
        this.gardenSize = gardenSize;
    }

    @Override
    public String getType() {
        return "Cottage";
    }

    @Override
    public void showInfo() {
            System.out.println("Building: " + getType() +
                    ", address: " + address +
                    ", square: " + square +
                    "sq.m, yearBuilt: " + yearBuilt +
                    ", hasGarden: " + hasGarden +
                    ", gardenSize: " + gardenSize +"sq.m");
    }

    public void plantTree() {
        System.out.println("🌳 Tree planted in garden!");
    }
}
