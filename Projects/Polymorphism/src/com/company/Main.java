package com.company;

import java.util.Scanner;

class Car {
    private boolean engine;
    private String name;
    private int cylinders;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true;
        this.wheels = 4;
    }
    public void getClassName() {
        System.out.println(getClass().getSimpleName());
    }
    public void startEngine() {
        System.out.println("Starting the engine");
    }
    public void accelerate() {
        System.out.println("Accelerating the car");
    }
    public void brake() {
        System.out.println("Stopping the car");
    }

    public String getName() {
        return this.name;
    }
    public int getCylinders() {
        return this.cylinders;
    }
}

class BMW extends Car {
    public BMW() {
        super(4,"BMW S-Class");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting " + super.getName() + " engine");
    }
}

class Ferrari extends Car {
    public Ferrari() {
        super(5,"Ferrari-Gt");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting " + super.getName() + " engine");
    }
}

class Mercedes extends Car {
    public Mercedes() {
        super(2,"Mercedes Rz");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting " + super.getName() + " engine");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int value = scanner.nextInt();

        if(value == 1) {
            Car car = new BMW();
            car.startEngine();
        } else if(value == 2) {
            Car car = new Ferrari();
            car.startEngine();
        } else if(value == 3) {
            Car car = new Mercedes();
            car.startEngine();
        } else {
            System.out.println("Unknown value");
        }

        Car car = new BMW();
        car.getClassName();
    }
}

