package com.company;

/*
 * Bank has customers.
 * Bank has creditors.
 * Bank has debtors.
 * Bank has investments.
 * Bank has rules.
 * Bank has rates.
 * Bank has branches, atms, employees.
 * Bank has top level executives.
 * */

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private static final String name = "Bandhan Bank";
    private final List<Customer> customers;
    private final List<Branches> branches;

    public Bank() {
        this.customers = new ArrayList<>();
        Customer defaultCustomer = new Customer("Default", "Default",
                "default@gmail.com", "0000000000", 0.00);
        this.customers.add(defaultCustomer);
        this.branches = new ArrayList<>();

        for (Branches branch : addBranches())
            this.branches.add(branch);
    }

    private Branches[] addBranches() {
        Branches phase3 = new Branches(this.getName(), "Phase3", 23, "Mr. Sumit Pandey");
        Branches phase2 = new Branches(this.getName(), "Phase2", 65, "Mrs Gurpreet Kaur");
        Branches phase1 = new Branches(this.getName(), "Phase1", 56, "Mrs Shalini Kochar");
        Branches oldDelhi = new Branches(this.getName(), "OldDelhi", 87, "Mr Ravi Prasad");
        Branches kerala = new Branches(this.getName(), "Kerala", 34, "Mr. Robert Alvaro");
        Branches newDelhi = new Branches(this.getName(), "NewDelhi", 76, "Mrs. Karan Jha");
        return new Branches[] {phase1, phase2, phase3, oldDelhi, kerala, newDelhi};
    }

    public boolean addCustomer(Customer customer) {
        for (Customer c : this.customers) {
            if (c.getFirstName().equalsIgnoreCase(customer.getFirstName())
                    && c.getLastName().equalsIgnoreCase(customer.getLastName())) {
                return false;
            }
        }
        this.customers.add(customer);
        return true;
    }

    public void printCustomer() {
        System.out.println(name + " contains " + this.customers.size() + " customers");
        for (Customer customer : this.customers)
            System.out.println(customer);
    }


    public String getName() {
        return name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public List<Branches> getBranches() {
        return this.branches;
    }
}
