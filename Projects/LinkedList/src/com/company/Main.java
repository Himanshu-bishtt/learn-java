/*
 * Linked List is another type of Data Structure in which each object contains
 * a data and a pointer to the next object.
 *
 * Linked List is dynamic and linear data structure,
 * and we can add or remove elements or objects
 * very easily, without shifting the data like we do in the Array Data Structure.
 *
 * Each object which contains data and a pointer is known as Node.
 *
 * Cursor position in Linked List (Shown by ^ symbol)
 *
 *       Element1       Element2        Element3        Element(n-1)
 *  ^               ^               ^               ^
 *
 * ListIterator don't have no current element. It has cursor position
 * which lies between two elements.
 * */


package com.company;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private final static LinkedList<String> citiesList = new LinkedList<>();

    public static void main(String[] args) {

        addCitiesToVisit("New Delhi");
        addCitiesToVisit("Kanpur");
        addCitiesToVisit("Bihar");
        addCitiesToVisit("Mumbai");
        addCitiesToVisit("Bangalore");
        addCitiesToVisit("Kerala");
        queryCities();

        traverseCitiesList();

    }

    private static void addCitiesToVisit(String cityName) {
        citiesList.add(cityName);
    }

    private static void queryCities() {

        System.out.println("******** List has " + citiesList.size()
                + " cities ********");
        for (String s : citiesList) {
            System.out.println(s);
        }
    }

    private static void traverseCitiesList() {
        ListIterator<String> listIterator = citiesList.listIterator();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        /*
        * goingForward to check which direction we are going
        * */
        boolean goingForward = true;
        int option;

        if (citiesList.isEmpty()) {
            System.out.println("List is empty");
        } else {
            System.out.println("Visiting --> " + citiesList.getFirst());
            /*
             * putting cursor pointer to the first element or head
             * of the list.
             * */
            listIterator.next();
        }

        while (flag) {
            printMenu();
            System.out.print("Enter option: ");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 0:
                    System.out.println("Exiting");
                    flag = false;
                    break;

                case 1:
                    if (!goingForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                    }
                    goingForward = true;
                    if (listIterator.hasNext()) {
                        System.out.println("Now visiting: " + listIterator.next());
                    } else {
                        System.out.println("You have reached the end!");
                        goingForward = false;
                    }
                    break;

                case 2:
                    if(goingForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                    }
                    goingForward = false;
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now visiting: " + listIterator.previous());
                    } else {
                        System.out.println("You have reached the top!");
                        goingForward = true;
                    }
                    break;

                case 3:
                    queryCities();
                    break;

                default:
                    System.out.println("Invalid Input");
            }
            System.out.println();
        }
    }

    private static void printMenu() {
        System.out.println("*******************************");
        System.out.println("0. To Quit");
        System.out.println("1. To Go Forward");
        System.out.println("2. To Go Backward");
        System.out.println("3. To Check List");
        System.out.println("*******************************");
    }
}
