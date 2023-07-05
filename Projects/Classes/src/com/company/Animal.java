package com.company;

// base class
public class Animal {
    private final String type; // this is blank final variable or uninitialized final variable
    private final String animalClass;
    private final String name;

    public Animal() {
        this("Default Type", "Default Class", "Default Name");
    } // constructor is a special type of method which is used to initialize objects.

    public Animal(String animalType, String animalClass, String animalName) {
        this.type = animalType;
        this.animalClass = animalClass;
        this.name = animalName;
    }

    // common methods which all animals share
    public void eat() {
        System.out.println("Yes all animals eat");
    }
    public void walk() {
        System.out.println("Animal.walk() called");
    }

    public String getType() {
        return type;
    }
    public String getAnimalClass() {
        return animalClass;
    }
    public String getName() {
        return name;
    }
}
