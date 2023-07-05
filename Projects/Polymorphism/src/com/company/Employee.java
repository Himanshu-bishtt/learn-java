package com.company;

public class Employee extends Person{
    private double salary;
    private String department;

    public Employee(String name, int age, int height, int weight,
                    double salary, String department) {
        super(name, age, height, weight);
        this.salary = salary;
        this.department = department;
    }

    @Override
    public void work() {
        System.out.println(super.getName() + " is working in "
                + this.department + " department" );
    }

    public double getSalary() {
        return salary;
    }
    public String getDepartment() {
        return department;
    }
}
