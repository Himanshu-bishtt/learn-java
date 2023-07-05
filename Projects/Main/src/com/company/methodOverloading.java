package com.company;

public class methodOverloading {

    public static int getDurationString(int minutes, int seconds) {
        if(minutes >= 0 && seconds >= 0 && seconds <= 59) {
            int hours = minutes / 60;
            int minutesData = minutes % 60;
            int secondsData = (hours * 3600 ) + (minutesData * 60);

            if(hours < 10 || minutes < 10 ) {
                System.out.println(String.format("%02d", hours) + "h "
                        + String.format("%02d", minutesData) + "m "
                        + String.format("%02d", seconds) + "s");
            } else {
                System.out.println(hours + "h " + minutesData + "m " + seconds + "s");
            }
            return secondsData;
        }
        return -1;
    }

    public static int getDurationString(int seconds) {
        if(seconds < 0) {
            return -1;
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
//        int hours = minutes / 60;
        System.out.println(seconds + " seconds = "
                + minutes + " mins "
                + remainingSeconds + " secs" );
        return getDurationString(minutes, remainingSeconds);
    }
}