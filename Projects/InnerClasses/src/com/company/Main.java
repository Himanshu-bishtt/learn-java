/*
 * Nested class are the classes declared within an outer class.
 *
 * Nested class help us to logically bind two classes which helps to
 * provide more encapsulation, readability and clean code.
 *
 * Nested classes are of two types.
 * 1. Static Nested Class - They are not strongly associated with outer class objects.
 * i.e. We can instantiate a static class object without the need of outer class.
 *
 * Syntax: OuterClass.InnerClass innerClassObject = new OuterClass.InnerClass();
 *
 * 2. Non-Static Nested Class (Inner class) - They are strongly associated with outer
 * class objects. i.e. We can only instantiate a innerClass by first initializing
 * the outerClass "Object".
 *
 * Syntax: OuterClass outerClassObject = new OuterClass();
 *         OuterClass.InnerClass innerClassObject = outerClassObject.new InnerClass();
 *
 * *************************************************************************************
 *
 * There are two types of Inner Class
 *
 * 1. Method Local Inner Class - Classes which are declared inside a block of if statement,
 * for loop, or method. Usually we declare a local class inside a method body.
 *
 * Classes declared inside a method body can only be used inside the method, means we have to
 * instantiate the class inside the method body.
 *
 * Inner Classes have access to the members of its enclosing class, and Local Inner Class
 * cannot have static methods but can have static variables.
 *
 * 2. Anonymous Inner Class - Class which do not have a name is known as anonymous classes.
 *
 * Anonymous classes help us to write more clean and readable code.
 *
 * Anonymous Classes have also access to the members of its enclosing class, and Anonymous
 * Class cannot have static methods but can have static variables.
 *
 * They are very used in creating GUI programs.
 *
 * */
package com.company;

import com.company.LambdaExpressions.Person;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        list.add("Himanshu");
        list.add(22);
        list.add(new Person("Himanshu", 20, new Date(), Person.Sex.MALE, "himanshu@gmail.com"));

        printList(list);


        MyHouse myHouse = new MyHouse();

        myHouse.open();

    }

    @Schedule(author = "Himanshu", date = "03/11/2020")
//    @Schedule(author = "Harsh", date = "11/12/20202")
    private static <T> void printList(ArrayList<T> list) {
        for (T obj : list)
            System.out.println(obj);
    }
}

@Target({ElementType.METHOD, ElementType.MODULE, ElementType.CONSTRUCTOR})
//@Repeatable(Schedules.class)
@interface Schedule {
    String author();
    String date();
    String lastUpdated() default "N/A";
    String lastUpdatedBy() default "N/A";
}

@interface Schedules {
    Schedule[] value();
}
@Repeatable(EnhancementRequests.class)
@interface EnhancementRequest {
    int id();
    String synopsis();
    String engineer() default "Unassigned";
    String date() default "Unknown";
}

@interface EnhancementRequests {
    EnhancementRequest[] value();
}

interface House {
    @Deprecated
    void open();
    void openFirstDoor();
    void openLastDoor();
}

@EnhancementRequest(id = 1, synopsis = "Test Annotation")
@EnhancementRequest(id = 2, synopsis = "Test Annotation 2")
class MyHouse implements House{

    @SuppressWarnings("deprecation")
    @Override
    public void open() {
        System.out.println("Open");
    }

    @Override
    public void openFirstDoor() {
        System.out.println("OpenFirstDoor");
    }

    @Override
    public void openLastDoor() {
        System.out.println("OpenLastDoor");
    }
}