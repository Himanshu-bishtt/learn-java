package com.company;

public class DogClass extends Animal{
    private final String color; // final keyword is use to indicate that the value cannot be modified.
    private final int teeth;
    private final int legs;
    private final int eyes;

    public DogClass(String animalColor, int animalTeeth, int animalLegs, int animalEyes) {
        super("Vertebrate", "Mammal", "Dog"); // super is used to refer parent class constructor
        this.color = animalColor;
        this.teeth = animalTeeth;
        this.legs = animalLegs;
        this.eyes = animalEyes;
    }
    @Override
    public void eat() {
        System.out.println("Yes all Dog eat");
        super.eat();
    }
    private void walkingDog() {
        System.out.println("Private Dog.walkingDog() called");
    }
    public void dogWalk() {
        System.out.println("Public Dog.dogWalk() called");
        walkingDog();
        //super.walk(); // will call parent class walk method because we use super keyword
        walk(); // will call Dog class walk() because it'll first check Current Class then will go to the parent
                // class for checking.
    }

    @Override
    public void walk() {
        System.out.println("Dog.walk() called");
        System.out.println("This output is in Dog class");
    }
}
