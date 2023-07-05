package com.company;

import java.util.Scanner;

public class readingUserInput {
    public static void calculateUserAge() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        while(true) {

            System.out.println("Enter your date of birth : ");
            boolean hasCorrectIntValue = scanner.hasNextInt();

            if(hasCorrectIntValue) {
                int dateOfBirth = scanner.nextInt();
                int age = 2020 - dateOfBirth;
                if(age >= 0 && age <= 100) {
                    System.out.println("Your name is " + name + " and age is " + age);
                    break;
                } else {
                    System.out.println("Invalid age. Please try again");
                }
            } else {
                System.out.println("String input is not valid");
            }
//            scanner.nextLine();
        }

        scanner.close();
    }

    // reading user input challenge
//    public static void getTenIntValues() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 10 integer values: ");
//        int value = 0;
//        for (int i = 1; i < 11; i++) {
//            System.out.println("Enter number " + i + ": ");
//            boolean hasNextInt = scanner.hasNextInt();
//            if(hasNextInt) {
//                value += scanner.nextInt();
//            } else {
//                System.out.println("Last value provided is not an Integer.");
//                break;
//            }
//        }
//        System.out.println("Sum of all the number entered so far = " + value);
//        scanner.close();
//    }

    public static void getTenIntValues() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int counter = 0;

        while (true) {
            int order = counter + 1;
            System.out.println("Enter value #" + order + " :");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt) {
                counter++;
                int number = scanner.nextInt();
                sum += number;

                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }
        System.out.println("Sum : " + sum);
        scanner.close();
    }

    public static void minAndMaxInputChallenge() {
        Scanner scanner = new Scanner(System.in);

        int maxNumber = 0;
        int minNumber = 0;
        boolean firstNumber = true;

        while(true) {
            System.out.println("Enter number : ");
            boolean hasNextInt = scanner.hasNextInt();

            if(hasNextInt) {
                int number = scanner.nextInt();

                if(firstNumber) {
                    // set min and max to the firstNumber entered
                    minNumber = number;
                    maxNumber = number;
                    System.out.println("MaxNumber : " + maxNumber);
                    System.out.println("MaxNumber : " + minNumber);
                    firstNumber = false;
                } else {
                    if(number < minNumber) {
                        minNumber = number;
                    } else if(number > maxNumber) {
                        maxNumber = number;
                    }
                }

            } else {
                System.out.println("Invalid input");
                break;
            }
            scanner.nextLine();
        }
        System.out.println("Min : " + minNumber + " Max : " + maxNumber);
        scanner.close();
    }
}