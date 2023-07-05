package com.company;

public class HealthyBurger extends Hamburger {
    public HealthyBurger(String meat) {
        super("Healthy Burger", "Brown rye bread roll", meat);
    }

    public double addSpinach() {
        return 1.1d;
    }

    public void getFullPrice() {
        double finalPrice = super.getBasePrice() + super.addCarrot()
                        + super.addLettuce() + super.addPickle()
                        + super.addTomato() + this.addSpinach();
        System.out.println("Total Healthy Burger Price: " + finalPrice);
    }
}
