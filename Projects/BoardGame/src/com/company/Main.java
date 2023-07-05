package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Player himanshu = new Player("Himanshu");
        Player harsh = new Player("Harsh");

        Board.printBoard();
        startGame(himanshu, harsh);
    }

    private static void startGame(Player player1, Player player2) {
        Scanner scanner = new Scanner(System.in);
//        int randomNumber = (int) (Math.random() * 6);
//        int dice = randomNumber == 0 ? randomNumber + 1 : randomNumber;

        while (true) {
            System.out.print(player1.getName() + " turn: ");

            int playerDice = scanner.nextInt(); // between 1 and 6

            while (true) {
                if (playerDice >= 1 && playerDice <= 6) {
                    player1.setCurrentPosition(player1.getCurrentPosition() + playerDice);
                    break;
                } else {
                    System.out.print("Incorrect play. Please play again: ");
                    playerDice = scanner.nextInt();
                }
            }

            System.out.print(player2.getName() + " turn: ");
            playerDice = scanner.nextInt();

            while (true) {
                if (playerDice >= 1 && playerDice <= 6) {
                    player2.setCurrentPosition(player2.getCurrentPosition() + playerDice);
                    break;
                } else {
                    System.out.print("Incorrect play. Please play again: ");
                    playerDice = scanner.nextInt();
                }
            }

            System.out.println(player1.getName() + " : " + player1.getCurrentPosition());
            System.out.println(player2.getName() + " : " + player2.getCurrentPosition());

            if (player1.getCurrentPosition() == 100) {
                System.out.println(player1.getName() + " won!!");
                System.out.println(player1.getName() + " : " + player1.getCurrentPosition());
                System.out.println(player2.getName() + " : " + player2.getCurrentPosition());
                break;
            } else if (player2.getCurrentPosition() == 100) {
                System.out.println(player2.getName() + " won!!");
                System.out.println(player1.getName() + " : " + player1.getCurrentPosition());
                System.out.println(player2.getName() + " : " + player2.getCurrentPosition());
                break;
            }

        }
    }
}

