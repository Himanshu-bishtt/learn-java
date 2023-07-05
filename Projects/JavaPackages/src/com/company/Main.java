package com.company;

import java.util.Scanner;

public class Main {

    private final static Scanner scanner = new Scanner(System.in);
    private final static Bank bandhan = new Bank();

    public static void main(String[] args) {
        boolean flag = true;

        while (flag) {
            displayMenu();
            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    System.out.println("Exiting..!");
                    flag = false;
                    break;

                case 1:
                    intialize();
                    break;

                case 2:
                    changeCustomerName();
                    break;

                case 3:
                    checkBalance();
                    break;

                case 4:
                    withdraw();
                    break;

                case 5:
                    deposit();
                    break;

                case 6:
                    bankSummary();
                    break;

                case 7:
                    bandhan.printCustomer();
                    break;

                case 8:
                    findBranch();
                    break;

                default:
                    System.out.println("Unknown command");
                    break;
            }
        }
    }

    public static void displayMenu() {
        System.out.println("********************************\n" +
                "\t\t1. Intialize \n" +
                "\t\t2. Change Name \n" +
                "\t\t3. Check Balance \n" +
                "\t\t4. Withdraw \n" +
                "\t\t5. Deposit \n" +
                "\t\t6. Bank Summary \n" +
                "\t\t7. Print Customers \n" +
                "\t\t8. Find Branch \n" +
                "\t\t0. Exit \n" +
                "\"*******************************");
    }

    public static void intialize() {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Phone: ");
        String phone = scanner.nextLine();

        System.out.print("Amount: ");
        double initialBalance = scanner.nextDouble();

        Customer customer = new Customer(firstName, lastName, email, phone, initialBalance);

        boolean added = bandhan.addCustomer(customer);

        if (added) {
            bandhan.addCustomer(customer);
        } else
            System.out.println("User already added");
    }

    public static void changeCustomerName() {
        Customer customer = findUser();

        if (customer != null) {
            System.out.print("New First Name: ");
            String newFirstName = scanner.nextLine();
            System.out.print("New Last Name: ");
            String newLastName = scanner.nextLine();

            customer.setFirstName(newFirstName);
            customer.setLastName(newLastName);
        } else
            System.out.println("User not found");
    }

    public static void checkBalance() {
        Customer customer = findUser();

        if (customer != null) {
            System.out.println("Balance: " + customer.getBalance());
        } else
            System.out.println("User not found");
    }

    public static void withdraw() {
        Customer customer = findUser();

        if (customer != null) {
            System.out.print("Withdraw amount: ");
            double withdrawAmount = scanner.nextDouble();

            if (customer.getBalance() >= withdrawAmount) {
                customer.setBalance(customer.getBalance() - withdrawAmount);
                customer.addTransactions(new Transactions('W', withdrawAmount, customer.getBalance()));
                System.out.println("Withdraw successful");
            } else {
                System.out.println("Insufficient balance");
            }
        } else
            System.out.println("User not found");
    }

    public static void deposit() {
        Customer customer = findUser();

        if (customer == null) {
            System.out.println("User not found!");
            return;
        }

        System.out.print("Deposit Amount: ");
        double depositAmount = scanner.nextDouble();

        if (depositAmount <= 0) {
            System.out.println("Please enter a valid number");
        } else {
            customer.setBalance(customer.getBalance() + depositAmount);
            customer.addTransactions(new Transactions('D', depositAmount, customer.getBalance()));
        }
    }

    public static void bankSummary() {
        Customer customer = findUser();

        if (customer != null) {
            System.out.println(customer);
        } else
            System.out.println("User not found");
    }

    private static void findBranch() {
        System.out.print("Branch Location: ");
        String branchLocation = scanner.nextLine();

        for (Branches branches : bandhan.getBranches()) {
            if (branches.getLocation().equalsIgnoreCase(branchLocation)) {
                System.out.println(branches);
                return;
            }
        }
        System.out.println("Branch not found");
    }

    private static Customer findUser() {
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();

        for (Customer customer : bandhan.getCustomers()) {
            if (customer.getFirstName().equalsIgnoreCase(firstName) && customer.getLastName().equalsIgnoreCase(lastName))
                return customer;
        }
        return null;
    }
}
