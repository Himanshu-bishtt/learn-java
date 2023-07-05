package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> implements Comparable<Team<T>> {
    private final String name;
    private final List<T> players;
    private int won;
    private int lost;
    private int played;
    private int draw;

    public Team (String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    @Override
    public int compareTo(Team<T> o) {
        if (this.ranking() > o.ranking()) {
            return -1;
        } else if (this.ranking() < o.ranking()) {
            return 1;
        } else {
            return 0;
        }
    }

    public void match(Team<T> opponent, int ourScore, int theirScore) {
        if (ourScore > theirScore) {
            this.won++;
            opponent.lost++;
        } else if (ourScore < theirScore) {
            this.lost++;
            opponent.won++;
        } else {
            this.draw++;
            opponent.draw++;
        }
        this.played++;
        opponent.played++;
    }

    public int ranking() {
        return (this.won * 2) + draw;
    }

    public void addPlayers(T player) {
        if (this.players.contains(player)) {
            return;
        }
        this.players.add(player);
    }

    public void printPlayers() {
        System.out.println(this.name + " contains " + this.players.size() + " players");
        for (T player : this.players) {
            System.out.println(player);
        }
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                " points='" + ranking() + '\'' +
                '}';
    }
}
