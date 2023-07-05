/*
 * Inheritance works when classes have IS-A relationship,
 * but Composition works when classes have HAS-A relationship,
 * as we can see in the below example Person is not a job, but Person has a JOB,
 * that's why we need to composition here.
 */

package com.company;

public class Person {
    private final Info info;
    private final Job job;

    public Person(Info info, Job job) {
        this.info = info;
        this.job = job;
    }
    public void test() {
        System.out.println("Test");
    }
    public Info getInfo() {
        return this.info;
    }
    public Job getJob() {
        return this.job;
    }
}
