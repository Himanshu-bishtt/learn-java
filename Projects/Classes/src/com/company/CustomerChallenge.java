package com.company;

public class CustomerChallenge {
    // fields, properties, attributes
    private final String name;
    private final double creditLimit;
    private final String email;

    // default constructor using default values
    public CustomerChallenge() {
        this("Himanshu", 200.00, "himanshu@mail.com");
    }

    // parameter constructor with only two values - name, email and creditLimit is default
    public CustomerChallenge(String name, String email) {
        this(name, 50.00, email);
    }

    // main constructor used to create other constructors
    public CustomerChallenge(String customerName, double customerCreditLimit, String customerEmail) {
        this.name = customerName;
        this.creditLimit = customerCreditLimit;
        this.email = customerEmail;
    }

    // getters
    public String getName() {
        return this.name;
    }
    public double getCreditLimit() {
        return this.creditLimit;
    }
    public String getEmail() {
        return this.email;
    }

}
