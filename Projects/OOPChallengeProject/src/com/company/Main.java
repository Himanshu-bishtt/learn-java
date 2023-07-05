package com.company;

public class Main {

    public static void main(String[] args) {
	    Hamburger hamburger = new Hamburger("Delicious Cream Burger",
                "Brown Bread", "Pork");

	    HealthyBurger healthyBurger = new HealthyBurger("Beef");
        System.out.println(healthyBurger.getName());
        System.out.println(healthyBurger.getBreadRoll());
        System.out.println(healthyBurger.getMeat());
        healthyBurger.getFullPrice();
    }
}
