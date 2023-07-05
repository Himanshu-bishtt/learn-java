package com.company;

public abstract class Player {
    private final String name;
    private final String sport;

    public Player (String name, String sport) {
        this.name = name;
        this.sport = sport;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", sport='" + sport + '\'' +
                '}';
    }
}
