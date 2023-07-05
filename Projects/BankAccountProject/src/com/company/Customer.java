package com.company;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Customer {
    private final String id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private double balance;
    private final List<Transactions> transactions;
    private final Date date;

    public Customer (String firstName, String lastName,
                     String email, String phone, Double balance) {
        this.id =  getNameChar(firstName) + getNameChar(lastName) + phone.charAt(phone.length() - 2)
                + phone.charAt(phone.length() - 1);
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.balance = balance;
        this.transactions = new ArrayList<>();
        this.date = new Date();
    }

    private String getNameChar(String name) {
        String temp = "";
        for (int i = 0; i < name.length() / 2; ++i) {
            temp += name.charAt(i);
        }
        return temp;
    }

    public void addTransactions(Transactions transactions) {
        this.transactions.add(transactions);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", balance=" + balance +
                ", transactions=" + transactions +
                ", date=" + date +
                '}';
    }
}
