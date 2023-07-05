package com.company;

public class switchStatement {
    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;

            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Unknown Value");
                break;
        }
    }

    public static void dayOfTheWeek(String day) {
        day = day.toLowerCase();

        if(day.equals("sunday")) {
            System.out.println(" 1st day of the week");
        } else if(day.equals("monday")) {
            System.out.println("2nd day of the week");
        } else if(day.equals("tuesday")) {
            System.out.println("3rd day of the week");
        } else {
            System.out.println("Unknown");
        }
    }
}
