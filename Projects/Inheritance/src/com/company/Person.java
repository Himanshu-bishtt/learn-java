package com.company;

import java.util.ArrayList;
import java.util.List;

public class Person implements Cloneable {
    enum SEX {
        FEMALE,
        MALE
    }
    private String name;
    private int age;
    private Job job;
    private SEX sex;

    public Person(String name, int age, SEX sex, Job job) {
        this.setName(name);
        this.setAge(age);
        this.setJob(job);
        this.sex = sex;
    }

    public static int compareByAge(Person a, Person b) {
        return Integer.compare(a.getAge(), b.getAge());
    }

    public static List<Person> populateList() {
        List<Person> list = new ArrayList<>();
        list.add(new Person("Harsh", 21, Person.SEX.MALE, new Job("IT", 10000)));
        list.add(new Person("Gigi", 18, Person.SEX.FEMALE, new Job("No Job", 0)));
        list.add(new Person("Himanshu", 21, Person.SEX.MALE, new Job("IT", 1200000)));
        list.add(new Person("Chandra", 25, Person.SEX.FEMALE, new Job("Marketing", 30000)));
        return list;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null)
            return false;
        if (!(object instanceof Person))
            return false;

        Person that = (Person) object;
        return this.getName().equals(that.getName())
                && this.getAge() == that.getAge()
                && this.getJob().getDepartment().equals(that.getJob().getDepartment())
                && this.getJob().getSalary() == that.getJob().getSalary();
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Person that = (Person) super.clone();
        that.setJob(new Job(this.getJob().getDepartment(), this.getJob().getSalary()));
        return that;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job=" + job +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setSex(Person.SEX sex) {
        this.sex = sex;
    }

    public SEX getSex() {
        return this.sex;
    }

    public Job getJob() {
        return this.job;
    }
}
