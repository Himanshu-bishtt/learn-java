package com.company;

public class Door {
    private final int doors;
    private final String color;

    public Door(int doors, String color) {
        this.doors = doors;
        this.color = color;
    }

    public int getDoors() {
        return doors;
    }
    public String getColor() {
        return color;
    }
}
