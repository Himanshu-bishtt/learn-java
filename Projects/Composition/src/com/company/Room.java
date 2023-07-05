/*
* Composition is a design technique in java, in which classes share a HAS-A relationship. Eg- Person and job,
* job IS-NOT-A person, in fact Person HAS-A job, that's here we will use Composition.
*
* On the other hand, we use Inheritance when classes share IS-A relationship. Eg- Animal and Dog,
* because Dog IS-A animal.
*
* In Composition, we use Object of classes as Instance variable.
*/

package com.company;

public class Room {
    private final Furniture furniture;
    private final CeilingFan fan;
    private final Doors doors;

    public Room(Furniture furniture, CeilingFan fan, Doors doors) {
        this.furniture = furniture;
        this.fan = fan;
        this.doors = doors;
    }

    public void turnOnFan() {
        fan.turnOnFan();
    }
    public void turnOffFan() {
        fan.turnOffFan();
    }
    public void increaseFanSpeed() {
        fan.increaseFanSpeed();
    }
    public void decreaseFanSpeed() {
        fan.decreaseFanSpeed();
    }
    public void askFurnitureRate(String askFurniture) {
        furniture.furnitureRate(askFurniture);
    }
    public void goToRoom() {
        doors.goToYourRoom();
    }
//    public Furniture getFurniture() {
//        return furniture;
//    }
//    public CeilingFan getFan() {
//        return fan;
//    }
//    public Doors getDoors() {
//        return doors;
//    }
}
