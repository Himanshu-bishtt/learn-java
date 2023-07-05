package com.company;

public class Player {
    private final String name;
    private int currentPosition = 1;

    public Player (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setCurrentPosition(int position) {
        this.currentPosition = position;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }
}
