/*
* Polymorphism is one of the important concepts of OOP (object oriented programming)
*
* Polymorphism is derived from a greek word means many forms i.e (Poly means many
* morphs means forms). It is done when classes share IS-A relationship.
*
* It is of two types
* 1. Compile Time Polymorphism - Also known as Static Polymorphism.
* 1.1 Method Overloading
* 1.2 Operator Overloading
*
* 2. Run Time Polymorphism - Also known as Dynamic Method Dispatching.
* 2.1 Method Overriding
*
* In Run time polymorphism, method is invoked during the runtime by JVM. And JVM
* determines which method to call.
* */
package com.company;

public class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void work() {
        System.out.println("Person is working very hard");
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public int getHeight() {
        return height;
    }
    public int getWeight() {
        return weight;
    }
}
