package com.company;

public class Bank {
    private String customer;
    private double balance;

    public Bank(String customer, double balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomer() {
        return this.customer;
    }
    public double getBalance() {
        return this.balance;
    }
}
