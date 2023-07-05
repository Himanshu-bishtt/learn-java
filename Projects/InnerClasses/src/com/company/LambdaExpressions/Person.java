package com.company.LambdaExpressions;

import java.util.Date;

public class Person {
    public enum Sex {
        MALE, FEMALE
    }

    private String name;
    private Date birthday;
    private int age;
    private Sex gender;
    private String emailAddress;

    public Person(String name, int age, Date birthday, Sex gender, String emailAddress) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
        this.gender = gender;
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Sex gender) {
        this.gender = gender;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public int getAge() {
        return this.age;
    }

    public Sex getGender() {
        return this.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", age=" + age +
                ", gender=" + gender +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }

    public void printPerson() {
        this.toString();
    }

}
