package com.company;

public class Job {
    private String jobPosition;
    private double salary;

    public Job(String jobPosition, double salary) {
        this.jobPosition = jobPosition;
        this.salary = salary;
    }

    public String getJobPosition() {
        return this.jobPosition;
    }
    public double getSalary() {
        return this.salary;
    }
}
