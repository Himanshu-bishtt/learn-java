/*
 *   Package is a collection of classes, interfaces and sub-packages.
 *   We use Packages in Java to Systematically bind 2 or more classes in one folder/Package
 *   for easy access.
 *
 *   There are two types of packages in java.
 *   1. Built-in packages
 *   2. User defined packages.
 *
 *   Package help us to reuse code more efficiently and effectively.
 *   And we can use a package with the help of import keyword.
 * */
package com.company;

public class Main {

    public static void main(String[] args) {

        OuterClass outerClass = new OuterClass();

        System.out.println("OuterClass field " + outerClass.getPrivateX());

        outerClass.timesThree();

        System.out.println("******************************");

        OuterClass.InnerClass innerClass = new OuterClass.InnerClass();

        System.out.println("InnerClass field " + innerClass.getPrivateX());

    }
}

class OuterClass {
    private final int privateX = 1;

    public OuterClass() {
        System.out.println("OuterClass Object created");
    }

    public int getPrivateX() {
        return this.privateX;
    }

    public void timesThree() {
        int privateX = 3;
        for (int i = 1; i <= 10; ++i)
            System.out.println(privateX + " multiply " + i + " = " + (2 * i));
    }

    public static class InnerClass {
        private final int privateX = 99;

        public InnerClass() {
            System.out.println("Inner Class Object");
        }

        public int getPrivateX() {
            return this.privateX;
        }

    }
}
