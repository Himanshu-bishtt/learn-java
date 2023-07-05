package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League<T extends Team> {
    private final String name;
    private final List<T> teams;

    public League(String name) {
        this.name = name;
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        if (this.teams.contains(team)) {
            return;
        }
        this.teams.add(team);
    }

    public void printTeam() {
        System.out.println(this.name + " contains " + this.teams.size() + " teams");
        Collections.sort(this.teams);
        for (T team : this.teams) {
            System.out.println(team);
        }
    }

    public String getName() {
        return name;
    }
}
