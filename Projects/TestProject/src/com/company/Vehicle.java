package com.company;

public class Vehicle {
    private final String type;
    private final String mode;

    public Vehicle(String type, String mode) {
        this.type = type;
        this.mode = mode;
    }

    public void move(int speed, String direction) {
        System.out.println(this.type + " is moving at " + speed + " Km/p "
        + " and towards " + direction + " direction");
    }

    public String getType() {
        return this.type;
    }
    public String getMode() {
        return this.mode;
    }
}
