package com.company;

public class Chair {
    private final String color;
    private final String type;
    private final double price = 250.00d;

    public Chair(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public String getColor() {
        return color;
    }
    public String getType() {
        return type;
    }
    public double getPrice() {
        return price;
    }
}
