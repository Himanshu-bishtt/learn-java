package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final char[][] gameBoard = {
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},

    };

    public static void main(String[] args) {
        printBoard();
        Scanner scanner = new Scanner(System.in);
        String player1 = "HIMANSHU";
        String player2 = "CPU";

        while (gameBoard[0][0] == ' ' || gameBoard[0][2] == ' ' || gameBoard[0][4] == ' '
                || gameBoard[2][0] == ' ' || gameBoard[2][2] == ' ' || gameBoard[2][4] == ' '
                || gameBoard[4][0] == ' ' || gameBoard[4][2] == ' ' || gameBoard[4][4] == ' ') {
            System.out.print("Enter your placement (1-9): ");
            int playerPosition = scanner.nextInt();
//            int cpuPosition = (int) (Math.random() * 9);
            int cpuPosition = new Random().nextInt(9) + 1;

            placePieceOnBoard(playerPosition, player1);
            placePieceOnBoard(cpuPosition, player2);

            if (gameBoard[0][0] == 'x' && gameBoard[0][2] == 'x' && gameBoard[0][4] == 'x'
                    || gameBoard[2][0] == 'x' && gameBoard[2][2] == 'x' && gameBoard[2][4] == 'x'
                    || gameBoard[4][0] == 'x' && gameBoard[4][2] == 'x' && gameBoard[4][4] == 'x'
                    || gameBoard[0][0] == 'x' && gameBoard[2][0] == 'x' && gameBoard[4][0] == 'x'
                    || gameBoard[0][2] == 'x' && gameBoard[2][2] == 'x' && gameBoard[4][2] == 'x'
                    || gameBoard[0][4] == 'x' && gameBoard[2][4] == 'x' && gameBoard[4][4] == 'x'
                    || gameBoard[0][0] == 'x' && gameBoard[2][2] == 'x' && gameBoard[4][4] == 'x'
                    || gameBoard[0][4] == 'x' && gameBoard[2][2] == 'x' && gameBoard[4][0] == 'x') {

                System.out.println(player1 + " wins");
                printBoard();
                System.exit(0);
            } else if (gameBoard[0][0] == 'o' && gameBoard[0][2] == 'o' && gameBoard[0][4] == 'o'
                    || gameBoard[2][0] == 'o' && gameBoard[2][2] == 'o' && gameBoard[2][4] == 'o'
                    || gameBoard[4][0] == 'o' && gameBoard[4][2] == 'o' && gameBoard[4][4] == 'o'
                    || gameBoard[0][0] == 'o' && gameBoard[2][0] == 'o' && gameBoard[4][0] == 'o'
                    || gameBoard[0][2] == 'o' && gameBoard[2][2] == 'o' && gameBoard[4][2] == 'o'
                    || gameBoard[0][4] == 'o' && gameBoard[2][4] == 'o' && gameBoard[4][4] == 'o'
                    || gameBoard[0][0] == 'o' && gameBoard[2][2] == 'o' && gameBoard[4][4] == 'o'
                    || gameBoard[0][4] == 'o' && gameBoard[2][2] == 'o' && gameBoard[4][0] == 'o') {
                System.out.println(player2 + " wins");
                printBoard();
                System.exit(0);
            }

            printBoard();
        }
        System.out.println("GAME TIED");

    }

    private static void printBoard() {
        for (char[] row : gameBoard) {
            for (char col : row)
                System.out.print(col + " ");
            System.out.println();
        }
    }

    private static void placePieceOnBoard(int position, String user) {

        if (position > 9 || position < 1)
            return;

        char symbol = 'o';

        if (!user.equalsIgnoreCase("CPU"))
            symbol = 'x';

        switch (position) {
            case 1:
                if (gameBoard[0][0] == ' ') {
                    gameBoard[0][0] = symbol;
                    System.out.println(user + " played: " + position);
                } else
                    System.out.println(user + " Tile is already played".toUpperCase());
                break;
            case 2:
                if (gameBoard[0][2] == ' ') {
                    gameBoard[0][2] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 3:
                if (gameBoard[0][4] == ' ') {
                    gameBoard[0][4] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 4:
                if (gameBoard[2][0] == ' ') {
                    gameBoard[2][0] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 5:
                if (gameBoard[2][2] == ' ') {
                    gameBoard[2][2] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 6:
                if (gameBoard[2][4] == ' ') {
                    gameBoard[2][4] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 7:
                if (gameBoard[4][0] == ' ') {
                    gameBoard[4][0] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 8:
                if (gameBoard[4][2] == ' ') {
                    gameBoard[4][2] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
            case 9:
                if (gameBoard[4][4] == ' ') {
                    gameBoard[4][4] = symbol;
                    System.out.println(user + " played: " + position);
                } else {
                    System.out.println(user + " Tile is already played".toUpperCase());
                }
                break;
        }
    }

}

