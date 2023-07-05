package com.company;

public class Person {
    private static final String name;

    static {
        name = "Himanshu Bisht";
        System.out.println("1st static initializer block called");
    }

    public Person () {
        System.out.println("Constructor called");
    }

    public String someMethod() {
        return "Person.someMethod() called";
    }

    static {
        System.out.println("2nd static initializer block called");
    }

    public static String getName() {
        return name;
    }
}
