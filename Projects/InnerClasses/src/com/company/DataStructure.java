package com.company;

import java.util.function.Function;

public class DataStructure {
    // Create an array
    private final static int SIZE = 15;
    private final static int[] arrayOfInts = new int[SIZE];

    public DataStructure() {
        // fill the array with ascending integer values
        for (int i = 0; i < SIZE; i++) {
            arrayOfInts[i] = i;
        }
    }

    public void printEven() {

        // Print out values of even indices of the array
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
    }

    public void print(Function<Integer, Boolean> iterator) {
        for (int value : arrayOfInts) {
            if (iterator.apply(value))
                System.out.print(value + " ");
        }
        System.out.println();
    }

    public void isEvenIndex() {
        DataStructureIterator iterator = this.new EvenIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    public void isOddIndex() {
        DataStructureIterator iterator = this.new OddIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    interface DataStructureIterator extends java.util.Iterator<Integer> {
    }

    // Inner class implements the DataStructureIterator interface,
    // which extends the Iterator<Integer> interface

    public class EvenIterator implements DataStructureIterator {

        // Start stepping through the array from the beginning
        private int nextIndex = 0;

        public boolean hasNext() {

            // Check if the current element is the last in the array
            return (nextIndex <= SIZE - 1);
        }

        public Integer next() {

            // Record a value of an even index of the array
            Integer retValue = arrayOfInts[nextIndex];

            // Get the next even element
            nextIndex += 2;
            return retValue;
        }

        public void print(DataStructureIterator iterator) {
            while (iterator.hasNext())
                System.out.print(iterator.next() + " ");
            System.out.println();
        }

        public void print(Function<Integer, Boolean> iterator) {
            for (int value : arrayOfInts) {
                if (iterator.apply(value))
                    System.out.println(value);
            }
        }
    }

    public class OddIterator implements DataStructureIterator {
        private int nextIndex = 1;

        public boolean hasNext() {
            return nextIndex <= SIZE - 1;
        }

        public Integer next() {
            Integer value = arrayOfInts[nextIndex];
            nextIndex += 2;

            return value;
        }
    }

    public static void main(String[] s) {

        // Fill the array with integer values and print out only
        // values of even indices
        DataStructure ds = new DataStructure();
        System.out.println("*************************");
        ds.printEven();
        DataStructure.EvenIterator evenIterator = ds.new EvenIterator();

        System.out.println("*************************");
        evenIterator.print(evenIterator);

        System.out.println("*************************");
        evenIterator.print(new DataStructureIterator() {
            private int nextIndex = 1;

            @Override
            public boolean hasNext() {
                return (nextIndex <= SIZE - 1);
            }

            @Override
            public Integer next() {
                Integer value = arrayOfInts[this.nextIndex];
                nextIndex += 2;

                return value;
            }
        });

        System.out.println("*************************");
        ds.print(integer -> {
            if (integer % 2 == 0)
                return Boolean.TRUE;
            return Boolean.FALSE;
        });

        System.out.println();
        ds.print(integer -> integer % 2 != 0);
    }
}
