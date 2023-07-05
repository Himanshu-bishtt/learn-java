package com.company;

public class Hamburger {
    private final String name;
    private final String breadRoll;
    private final String meat;
    private final double basePrice;
    private double finalPrice = 0.00d;

    public Hamburger(String name, String breadRoll, String meat) {
        this.name = name;
        this.breadRoll = breadRoll;
        this.meat = meat;
        this.basePrice = 12.00d;
    }

    public double addTomato() {
            return .86d;
    }
    public double addLettuce() {
            return 1.2d;
    }
    public double addCarrot() {
            return .5d;
    }
    public double addPickle() {
            return .9d;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    public String getName() {
        return name;
    }
    public String getBreadRoll() {
        return breadRoll;
    }
    public String getMeat() {
        return meat;
    }
}

