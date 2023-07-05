package com.company;

public class Car extends  Vehicle{
    private final Door doors;
    private final Wheel wheels;
    private final Engine engine;
    private final String color;
    private final String model;
    private int currentGear = 0; // car is off

    public Car(Door doors, Wheel wheels, Engine engine, String color, String model) {
        super("Car", "Land");
        this.doors = doors;
        this.wheels = wheels;
        this.engine = engine;
        this.color = color;
        this.model = model;
    }

    public void accelerateCar() {
        final int maxGears = 6;
        if(this.currentGear >= 1 && this.currentGear <= maxGears) {
            System.out.println("Current gear: " + this.currentGear);
            this.currentGear++;
        } else {
            System.out.println("Car is running at max speed");
        }
    }

    public void startCar() {
        if(this.currentGear == 1) {
            System.out.println("Car is already started -> Car.startCar()");
        } else {
            engine.engineOn();
            this.currentGear++;
            System.out.println("Starting the car -> Car.startCar()");
        }
    }

    public void checkCarWarranty() {
        engine.checkWarranty();
    }

    public String getColor() {
        return color;
    }
    public String getModel() {
        return model;
    }
}
