package com.company;

public class Vehicle {
    // fields (Assuming only land vehicles)
    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    // generic methods
    public void steer(int direction) {
        this.currentDirection = direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection
                + " degree");
    }
    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;

        System.out.println("Velocity: " + this.currentVelocity
                + "Km/h at, Direction: " + this.currentDirection);
    }
    public void stop() {
        this.currentVelocity = 0;
    }

    // getters
    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
}
