package com.company;

public class whileLoop {
    public static void whileLooping() {
        int count = 10;

        do {
            System.out.println("Value is " + count);
            count++;
        }while(count != 10);
    }

    public static void printEvenNumber() {
        int number = 4;
        int endNumber = 20;
        int evenNumberFound = 0;

        while (number <= endNumber) {
            number++;
            if(number % 2 == 0) {
                System.out.println("Even Number " + number);
                evenNumberFound++;

                if(evenNumberFound == 5) {
                    break;
                }
            }
        }
        System.out.println("Even number found are " + evenNumberFound);
    }

    // Sum digits passed in arguments
    public static int digitSum(int number) {
        if(number < 10) {
            return -1;
        }

        int sum = 0;

        while(number > 0) {
            int digit = number % 10;
            sum = sum + digit;

            number = number / 10;
        }
        return sum;
    }
}
