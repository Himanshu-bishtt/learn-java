package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int accelerateSpeed;
        int direction;
        BMW myBmw = new BMW(12);

        while(true) {
            System.out.println("Enter speed: ");
            accelerateSpeed = scanner.nextInt();
            System.out.println("Enter direction: ");
            direction = scanner.nextInt();

            if (accelerateSpeed == -1 || direction == -1) {
                System.out.println("Exiting....");
                break;
            } else {
                myBmw.accelerate(accelerateSpeed, direction);
                System.out.println();
            }
        }
    }
}

