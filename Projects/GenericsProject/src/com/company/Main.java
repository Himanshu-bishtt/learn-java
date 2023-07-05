/*
 * Static variables and Static methods belongs to the class, and they are shared between all
 * the objects of the same class.
 *
 * If one object changes the static variable, all object using that static variable will be
 * affected.
 *
 * We can access static variable without creating an instance of the class, because it's belong the class,
 * but to access instance variables or methods we need to instantiate the object first.
 *
 * Static method can not access instance variable or methods.
 *
 * */

package com.company;

public class Main {

    public static void main(String[] args) {
        Student.setSchool("Ryan International");
        System.out.println(Student.getNumberOfStudents());

        Student himanshu = new Student("Himanshu", 20);
        System.out.println(himanshu.getSchool());

        Student harsh = new Student("Harsh", 20);
        System.out.println(himanshu.getSchool());

        Student[] arr = {himanshu, harsh};


        for (Student student : arr)
            System.out.println(student);

    }
}

class Student {
    private final String name;
    private final int age;
    private static String school = "Hierank Business School";
    private static int numberOfStudents = 0;

    public Student (String name, int age) {
        this.name = name;
        this.age = age;
        numberOfStudents++;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public static void setSchool(String s) {
        school = s;
    }

    public static String getSchool() {
        return school;
    }

    public static int getNumberOfStudents() {
        return numberOfStudents;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", school=" + school +
                '}';
    }
}
