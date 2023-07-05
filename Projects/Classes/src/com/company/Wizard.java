package com.company;

public class Wizard {
    // fields or properties
    private final String name;
    private final String specialPower;
    private final int health;
    private final int xp;

    public Wizard(String wizardName, String wizardSpecialPower, int wizardHealth, int wizardXp) {
        this.name = wizardName;
        this.specialPower = wizardSpecialPower;
        this.health = wizardHealth;
        this.xp = wizardXp;
    }

    public String getName() {
        return name;
    }

    public String getSpecialPower() {
        return specialPower;
    }

    public int getHealth() {
        return health;
    }

    public int getXp() {
        return xp;
    }
}
