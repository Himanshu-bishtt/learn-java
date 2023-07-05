package com.company;

public class Theatre {
    private static final String name;
    private final int totalRows = 5;
    private final int totalColumns = 10;
    private final Seat[][] tickets = new Seat[totalRows][totalColumns];

    static {
        name = "Olympian Plaza";
    }

    public Theatre () {
        int lastRow = 'A' + (totalRows - 1);

        for (int row = 0; row < totalRows; ++row) {
            for (int col = 0; col < totalColumns; ++col) {
                char r = (char) (65 + row);
                tickets[row][col] = new Seat(r + String.format("%02d", (col+1)), 0.00);
            }
        }
    }

    public void printSeat() {
        for (int row = 0; row < tickets.length; ++row) {
            for (int col = 0; col < tickets[row].length; ++col) {
                if (col == 9 || col == 19 || col == 29 || col == 39) {
                    System.out.println(tickets[row][col].getNumber());
                }
                System.out.print(tickets[row][col].getNumber() + " ");
            }
        }
    }

    public static String getName() {
        return name;
    }

    private static class Seat {
        private final String number;
        private final double cost;
        private Customer customer;

        public Seat (String number, double cost) {
            this.number = number;
            this.cost = cost;
        }

        public String getNumber() {
            return number;
        }

        public double getCost() {
            return cost;
        }

        public Customer getCustomer() {
            return this.customer;
        }

        private static class Customer {
            private String name;
            private int age;

            public Customer (String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }
    }
}
