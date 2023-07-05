package com.company;

public class Board {
    private static final String[][] board;

    static {
        board = new String[10][10];
        int startingTitle = 1;
        for (int row = 0; row < board.length; ++row) {
            for (int col = 0; col < board[row].length; ++col) {
                if (startingTitle < 10)
                    board[row][col] = String.format(0 + "%1s", startingTitle);
                else
                    board[row][col] = Integer.toString(startingTitle);
                startingTitle++;
            }
        }
    }

    public static void printBoard() {
        System.out.println("\t\t\tWho reaches 100 will win\n".toUpperCase());
        for (String[] row : board) {
            for (String col : row)
                System.out.print(col + "   ");
            System.out.println();
        }
    }

    public static String[][] getBoard() {
        return board;
    }
}
