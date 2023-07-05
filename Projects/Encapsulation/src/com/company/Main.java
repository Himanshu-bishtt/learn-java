/*
 * Encapsulation means protecting the data members or instance variable or fields
 * from direct access.
 *
 * We perform Encapsulation by specifying the fields as private. Which prevents it from
 * direct access from any other class.
 *
 * These private fields or instance variables can only be access or modified through getters
 * and setters.
 *
 * Encapsulation also known as Data Hiding.
 * */

package com.company;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(55,20, true);

        printer.fillToner(100);
        System.out.println(printer.getTonerLevel());
    }
}