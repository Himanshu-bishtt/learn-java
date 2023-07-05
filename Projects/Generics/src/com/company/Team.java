package com.company;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Player> {
    private final String name;
    private int won = 0;
    private int played = 0;
    private int lost = 0;
    private int draw = 0;
    private final List<Player> players;

    public Team(String name) {
        this.name = name;
        this.players = new ArrayList<>();
    }

    public void addPlayer(T player) {
        if (this.players.contains(player)) {
            // don't add
            return;
        }
        this.players.add(player);
    }

    public void printPlayer() {
        System.out.println(this.name + " contains " + this.players.size() + " players");
        for (Player player : this.players) {
            System.out.println(player);
        }
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        String message;
        if (ourScore > theirScore) {
            this.won++;
            message = " beat ";
        } else if (ourScore < theirScore) {
            this.lost++;
            message = " lost to ";
        } else {
            this.draw++;
            message = " drew with ";
        }
        this.played++;
        System.out.println(getName() + message + opponent.getName());
    }

    public void getStats() {
        System.out.println("Team: " + this.getName() + "\n"+
                "Won: " + this.won + "\n" +
                "Lost: " + this.lost + " \n" +
                "Draw: " + this.draw + " \n" +
                "Played: " + this.played);
    }

    public int ranking() {
        return (this.won * 2 + this.draw) - this.lost;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getPlayed() {
        return played;
    }

    public int getLost() {
        return lost;
    }

    public int getDraw() {
        return draw;
    }
}
