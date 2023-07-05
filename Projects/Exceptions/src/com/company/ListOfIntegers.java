package com.company;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ListOfIntegers {
    public static List<Integer> integerList;
    private static final int SIZE = 15;

    public ListOfIntegers() {
        integerList = new ArrayList<>();
        for (int i = 0; i < SIZE; ++i) {
            integerList.add(i);
        }
    }

    public void writeList() {
        PrintWriter writer = null;
        try {
            System.out.println("Executing Try Block");
            writer = new PrintWriter(new FileWriter("output.txt"));
            for (int i = 0; i < SIZE; ++i) {
                writer.println("Value: " + integerList.get(i));
            }
        } catch (IndexOutOfBoundsException | IOException exception) {
            System.err.println("IndexOutOfBoundsException found: " + exception.getMessage());
            System.err.println("IOException found: " + exception.getMessage());
        } finally {
            if (writer != null) {
                System.out.println("Closing writer");
                writer.close();
            } else {
                System.out.println("Writer is not open");
            }
        }
    }
}
