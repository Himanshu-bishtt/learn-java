package com.company;

public class parseString {
    public static void test() {
        String numberAsString = "2020";
        System.out.println("NumberAsString = " + numberAsString);

        double stringToFloat = Double.parseDouble(numberAsString);
        System.out.println("StringToFloat = " + stringToFloat);

        int stringToInt = Integer.parseInt(numberAsString);
        System.out.println("StringToInt = " + stringToInt);

    }
}
