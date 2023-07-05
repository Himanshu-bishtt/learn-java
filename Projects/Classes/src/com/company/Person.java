package com.company;

public class Person {
    private String name;
    private int age;

    public void setName(String name) {
        String isNameValid = name.toLowerCase();

        if(isNameValid.equals("himanshu") || isNameValid.equals("harsh")) {
            this.name = name;
        } else {
            this.name = "Unknown";
        }
    }

    public String getName() {
        return this.name;
    }
}