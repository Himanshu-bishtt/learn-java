package com.company;

public class Info {
    private final String firstName;
    private final String lastName;
    private final int age;
    private final int height;
    private final int weight;

    public Info(String firstName, String lastName, int age, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void getFirstNameAndAge() {
        System.out.println("FirstName: " + this.firstName);
        System.out.println("Age: " + this.age);
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
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
