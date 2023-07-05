package com.company;

public class StudyTable {
    private final String color;
    private final String type;
    private final double price = 100.00d;

    public StudyTable(String color, String type) {
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
