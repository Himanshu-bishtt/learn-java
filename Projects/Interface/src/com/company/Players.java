package com.company;

import java.util.ArrayList;
import java.util.List;

public class Players implements iSaveable {
    private String name;
    private int health;
    private int xp;

    public Players(String name, int health, int xp) {
        this.name = name;
        this.health = health;
        this.xp = xp;
    }

    @Override
    public List<String> write() {
        List<String> players = new ArrayList<>();
        players.add(0, this.name);
        players.add(1, Integer.toString(this.health));
        players.add(2, Integer.toString(this.xp));
        return players;
    }

    @Override
    public void read(List<String> values) {
        if (values != null && values.size() > 0) {
            this.name = values.get(0);
            this.health = Integer.parseInt(values.get(1));
             this.xp = Integer.parseInt(values.get(2));
        }
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getXp() {
        return xp;
    }

    @Override
    public String toString() {
        return "Players{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", xp=" + xp +
                '}';
    }
}
