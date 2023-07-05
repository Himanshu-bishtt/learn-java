/*
 * Abstract classes in Java helps us to provide abstraction in our program.
 *
 * Abstract classes is use by declaring "abstract" keyword in front of the class.
 *
 * Syntax: abstract class ClassName {
 *       private final String name; // can contain fields
 *
 *       public void func() { // can contain both abstract or non-abstract methods.
 *       }
 *       public abstract void func2(); // this method must be implemented in the derived class.
 * }
 *
 * In abstract class functions are may or may not be abstract. Means it provides more flexibility
 * than an interface. But if a function is abstract then we have to declare that class as abstract.
 *
 * We can also create fields or instance variables, or data members in abstract class.
 *
 * Abstract class cannot be instantiated, only derived class which is extending the abstract class
 * can be instantiated, and derived class have to provide the implementation of the abstract methods of the
 * abstract class.
 * */
package com.company;

public class Main {

    public static void main(String[] args) {
    }
}