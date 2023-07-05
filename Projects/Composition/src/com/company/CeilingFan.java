package com.company;

import java.sql.SQLOutput;

public class CeilingFan {
    private final int blades;
    private final String color;
    private final int maxSpeed = 6;

    private int currentSpeed = 0;

    public CeilingFan(int blades, String color) {
        this.blades = blades;
        this.color = color;
    }

    public void turnOnFan() {
        if(currentSpeed == 1) {
            System.out.println("Fan is already running at speed: " + this.currentSpeed);
        } else {
            currentSpeed = 1;
            System.out.println("Fan running at speed: " + this.currentSpeed);
        }
    }

    public void turnOffFan() {
        System.out.println("Turning off the fan");
        this.currentSpeed = 0;
    }

    public void increaseFanSpeed() {
        if(currentSpeed == this.maxSpeed) {
            System.out.println("Already running in full speed");
        } else {
            currentSpeed += 1;
            System.out.println("Fan running at speed: " + this.currentSpeed);
        }
    }

    public void decreaseFanSpeed() {
        if(currentSpeed == 1) {
            System.out.println("Fan running at lowest speed");
        } else {
            currentSpeed -= 1;
            System.out.println("Fan running speed decrease to: " + this.currentSpeed);
        }
    }

    public int getBlades() {
        return blades;
    }
    public String getColor() {
        return color;
    }
    public int getMaxSpeed() {
        return maxSpeed;
    }
}
