package com.company;

public class FrogClass extends Animal {
    // fields
    private final int legs;
    private final int eyes;
    private final String food;

    public FrogClass(int legs, int eyes, String food) {
        super("Vertebrate", "Amphibian", "Frog");
        this.legs = legs;
        this.eyes = eyes;
        this.food = food;
    }

    public int getLegs() {
        return legs;
    }
    public int getEyes() {
        return eyes;
    }
    public String getFood() {
        return food;
    }

    public void frogFood() {
        System.out.println("Frog.frogFood() called");
        eat(); // will call eat method in Animal Class because of super keyword
    }


    @Override
    public void eat() {
        System.out.println(getName() + " eats " + getFood());
    }
}

