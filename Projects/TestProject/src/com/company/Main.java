package com.company;

public class Main {

    public static void main(String[] args) {
        Door door = new Door(4, "Black");
        Wheel wheel = new Wheel(4, "Silver");
        Engine engine = new Engine("BMR-220",4);

        Car car = new Car(door, wheel, engine, "Matte Black", "Rx3-121");
        car.startCar();
        car.accelerateCar(); // 1
        car.accelerateCar(); // 2
        car.accelerateCar(); // 3
        car.accelerateCar(); // 4
        car.accelerateCar(); // 5
        car.accelerateCar(); // 6 - max Speed
        car.accelerateCar();
        
        System.out.println();

        car.checkCarWarranty();
    }
}
