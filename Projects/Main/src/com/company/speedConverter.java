package com.company;

public class speedConverter {

    public static double toMilesPerHour(double kilometerPerHour) {
        double oneMileInKm = 0.621371d;
        if(kilometerPerHour < 0) {
            return -1;
        }
        return kilometerPerHour * oneMileInKm;
    }

    public static void printConversion(double kilometerData) {
        if(kilometerData < 0) {
            System.out.println("Invalid value");
        } else {
            double milesPerHourData = toMilesPerHour(kilometerData);
            System.out.println(kilometerData + " km/h = " + milesPerHourData + " m/h");
        }
    }
}