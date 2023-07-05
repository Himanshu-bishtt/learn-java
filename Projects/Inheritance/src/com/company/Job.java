package com.company;

public class Job {
    private String department;
    private double salary;

    public Job(String department, double salary) {
        this.setDepartment(department);
        this.setSalary(salary);
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return this.department;
    }

    public double getSalary() {
        return this.salary;
    }

    @Override
    public String toString() {
        return "Job{" +
                "department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}