package com.company;

public class Table {
    private final String color;
    private final String material;
    private final double price = 1000.00d;

    public Table(String color, String material) {
        this.color = color;
        this.material = material;
    }

    public String getColor() {
        return color;
    }
    public String getMaterial() {
        return material;
    }
    public double getPrice() {
        return price;
    }
}
