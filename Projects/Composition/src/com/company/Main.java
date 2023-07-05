package com.company;

public class Main {

    public static void main(String[] args) {
        Table table = new Table("Brown","Wooden");
        Chair chair = new Chair("Brown","Wooden");
        StudyTable studyTable = new StudyTable("Brownish", "Wooden");

        Furniture furniture = new Furniture(table, chair, studyTable);
        CeilingFan fan = new CeilingFan(3, "White");
        Doors doors = new Doors("Black-brown","Metal",5, "Wooden");

        Room room = new Room(furniture, fan, doors);
        room.turnOnFan();
        room.askFurnitureRate("table");
        room.goToRoom();

    }
}
