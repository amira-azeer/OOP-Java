package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("North");
        Wall wall3 = new Wall("East");
        Wall wall4 = new Wall("South");
        Ceiling ceiling = new Ceiling(12, "Yellow");
        Bed bed = new Bed("Modern", 3, 4, 2,1);
        Lamp lamp = new Lamp("Classic", false, 75);
        Bedroom bedroom = new Bedroom("Amira", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedroom.makeBed();//This is connected to 2 classes, goes to bedroom, bed class and access make bed
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
    }
}
