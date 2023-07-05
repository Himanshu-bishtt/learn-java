package com.company;

public class BankAccount {
    // fields
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String phoneNumber;

    // constructor

    // default constructor
    public BankAccount() {
        System.out.println("Default Constructor is called");
    }

    // parameterized constructor
    public BankAccount(String number, double balance, String customerName,
                       String customerEmail, String phoneNumber) {
        System.out.println("Parameterized constructor is called");

        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.phoneNumber = phoneNumber;
    }

    public String getNumber() {
        return number;
    }
    public double getBalance() {
        return balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
}
