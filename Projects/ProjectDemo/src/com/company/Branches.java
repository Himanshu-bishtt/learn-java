package com.company;

public class Branches {
    private final String name;
    private final String location;
    private final int employees;
    private final String manager;
    private final String ifsc;

    public Branches (String name, String location, int employees, String manager) {
        this.name = name;
        this.location = location;
        this.employees = employees;
        this.manager = manager;
        this.ifsc = getIfsc(this.name) + getIfsc(this.location) + ((int) (Math.random() * 10));
    }

    private String getIfsc(String data) {
        String ifscData = "";
        for (int i = 0; i < data.length() / 2; ++i)
            ifscData += data.charAt(i);

        return ifscData;
    }
    public String getLocation() {
        return this.location;
    }

    @Override
    public String toString() {
        return "Branches{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", employees=" + employees +
                ", manager='" + manager + '\'' +
                ", ifsc='" + ifsc + '\'' +
                '}';
    }
}
