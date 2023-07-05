package com.company;

public class forLoop {
    public static double calculateInterest(double amount, double interest) {
        return (amount * (interest / 100));
    }

//    public static boolean isPrime(int n) {
//        if (n == 0 || n == 1) {
//            return false;
//        }
//        for(int i = 2; i <= n/i; i++) {
//            if(n % 2 == 0) {
//                return false;
//            }
//        }
//        return true;
//    }

    public static void challenge() {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Number divisible by both 3 and 5 = " + i);
                count++;
                sum += i;
                if (count == 5) {
                    System.out.println("Ending the loop");
                    System.out.println("Sum of the numbers = " + sum);
                    break;
                }
            }
        }
    }

    public static void challenge2() {
        int multiples = 0;
        for (int i = 1; i <= 10; i++) {
            int multiplesOf = 2;
            multiples = multiplesOf * i;
            System.out.println(multiplesOf + " x " + i + " = " + multiples);
        }
    }


}