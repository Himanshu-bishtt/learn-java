package com.company;

import java.util.Date;

public class Transactions {
    private final char type;
    private final double amount;
    private final double balance;
    private final Date date;

    public Transactions (char type, double amount, double balance) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.date = new Date();
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Transactions{" +
                "type=" + type +
                ", amount=" + amount +
                ", balance=" + balance +
                ", date=" + date +
                '}';
    }
}
