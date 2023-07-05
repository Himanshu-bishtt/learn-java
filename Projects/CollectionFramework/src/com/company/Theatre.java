package com.company;

import java.util.*;

public class Theatre {
    private static final String name;
    private final List<Seat> seats;

    public Theatre() {
        this.seats = new ArrayList<>();

        int numberOfRows = 5;
        int numberOfColumns = 10;

        int lastRow = 'A' + (numberOfRows - 1);
        for (char row = 'A'; row <= lastRow; ++row)
            for (int col = 1; col <= numberOfColumns; ++col) {
                double price = 190.00;

                if (row > 'B' && col > 3 && col < numberOfColumns - 3) {
                    price = price + 150.00;
                }
                this.seats.add(new Seat(row + String.format("%02d", col), price));
            }
    }

    static {
        name = "New Shore Plaza";
    }

    static final Comparator<Seat> PRICE_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
            return Double.compare(seat1.getPrice(), seat2.getPrice());
        }
    };

    static final Comparator<Seat> NUMBER_ORDER = new Comparator<Seat>() {
        @Override
        public int compare(Seat seat1, Seat seat2) {
//            return seat1.getNumber().compareToIgnoreCase(seat2.getNumber());
            return String.CASE_INSENSITIVE_ORDER.compare(seat1.getNumber(), seat2.getNumber());
        }
    };

    static final Comparator<Seat.Customer> CUSTOMER_ORDER = new Comparator<Seat.Customer>() {
        @Override
        public int compare(Seat.Customer customer1, Seat.Customer customer2) {
            return customer1.getName().compareToIgnoreCase(customer2.getName());
        }
    };

    public void reserveSeat() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seat Number to reserve: ");
        String seatNumber = scanner.nextLine();

        Seat reservingSeat = findSeat(seatNumber);

        if (reservingSeat != null) {
            System.out.print("Enter your name: ");
            String customerName = scanner.nextLine();
            System.out.print("Enter your age: ");
            int customerAge = scanner.nextInt();
            reservingSeat.customer = new Seat.Customer(customerName, customerAge);
            reservingSeat.reserved = true;
            reservingSeat.number = " X ";
            reservingSeat.newSeatNumber = seatNumber;
            System.out.println("Seat " + seatNumber + " reserved under " + reservingSeat.getCustomer().name + ". " +
                    "Please pay " + reservingSeat.getPrice());

        } else {
            System.out.println("Seat " + seatNumber + " not available");
        }
    }

    public void cancelSeat() {
        System.out.print("Seat number to cancel: ");

    }

    public Seat findSeat(String seatNumber) {
        for (Seat seat : this.seats) {
            if (seat.getNumber().equalsIgnoreCase(seatNumber)) {
                return seat;
            }
        }
        return null;
    }

    public void testPrint() {
        System.out.println("**********  Seat Booking  **********");
        for (int i = 0; i < this.seats.size(); ++i) {
            if (i == 9 || i == 19 || i == 29 || i == 39 || i == 49) {
                System.out.print(this.seats.get(i).getReserved() + "\n");
                continue;
            }
            System.out.print(this.seats.get(i).getReserved() + " ");
        }
    }

    public void printSeat() {
        System.out.println("\t" + getName() + " Seat Booking \n");
        for (int i = 0; i < this.seats.size(); ++i) {
            if (i == 9 || i == 19 || i == 29 || i == 39 || i == 49) {
                System.out.print(this.seats.get(i).getNumber() + "\n");
                continue;
            }
            System.out.print(this.seats.get(i).getNumber() + " ");
        }
    }

    public void printReservedSeats() {
        for (Seat seat : this.seats) {
            if (seat.getReserved())
                System.out.println(seat.getCustomer());
        }
    }

    public static String getName() {
        return name;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public static class Seat {
        private String number;
        private String newSeatNumber;
        private final double price;
        private boolean reserved = false;
        private Customer customer;

        public Seat(String number, double price) {
            this.number = number;
            this.price = price;
        }

        public Customer getCustomer() {
            return this.customer;
        }

        public String getNumber() {
            return this.number;
        }

        public boolean getReserved() {
            return this.reserved;
        }

        public double getPrice() {
            return this.price;
        }

        @Override
        public String toString() {
            return "Seat{" +
                    "number='" + newSeatNumber + '\'' +
                    ", price='" + price + '\'' +
                    ", reserved=" + reserved +
                    ", customer=" + customer +
                    '}';
        }

        private static class Customer implements Comparable<Customer> {
            private final String name;
            private final int age;

            public Customer(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return this.name;
            }

            @Override
            public int compareTo(Customer customer) {
                return String.CASE_INSENSITIVE_ORDER.compare(this.getName(), customer.getName());
            }

            @Override
            public String toString() {
                return "Customer{" +
                        "name='" + name + '\'' +
                        ", age=" + age +
                        '}';
            }
        }
    }
}
