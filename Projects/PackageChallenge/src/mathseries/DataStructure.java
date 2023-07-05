package mathseries;

import java.util.Iterator;
import java.util.function.Function;

public class DataStructure {
    private final static int SIZE = 15;
    private final int[] array = new int[SIZE];

    public DataStructure() {
        for (int i = 0; i < this.array.length; ++i) {
            this.array[i] = i;
        }
    }

    public void printEven() {
        DataStructureIterator iterator = new EvenIterator();
        while (iterator.hasNext())
            System.out.print(iterator.next() + " ");
        System.out.println();
    }

    // Questions
    public void print(DataStructureIterator dataStructureIterator) {
        while (dataStructureIterator.hasNext())
            System.out.print(dataStructureIterator.next() + " ");
        System.out.println();
    }

    public void print(Function<Integer, Boolean> iterator) {
        for (int value : this.array) {
            if (iterator.apply(value))
                System.out.print(value + " ");
        }
        System.out.println();
    }

    public static Boolean isEvenIndex(Integer value) {
        return value % 2 == 0;
    }

    public static boolean isOddIndex(Integer value) {
        return value % 2 != 0;
    }

    interface DataStructureIterator extends Iterator<Integer> {
    }

    private class EvenIterator implements DataStructureIterator {
        private int nextIndex = 0;

        @Override
        public boolean hasNext() {
            return (this.nextIndex <= SIZE - 1);
        }

        @Override
        public Integer next() {
            Integer value = DataStructure.this.array[this.nextIndex];
            nextIndex += 2;
            return value;
        }

        public int getNextIndex() {
            return this.nextIndex;
        }

    }

    public static void main(String[] args) {
        DataStructure dataStructure = new DataStructure();
        System.out.println("PRINT EVEN METHOD");
        dataStructure.printEven();

        System.out.println("ANONYMOUS CLASS EXPRESSION ON PRINT EVEN METHOD");
        dataStructure.print(new DataStructureIterator() {
            private int currentIndex = 1;

            @Override
            public boolean hasNext() {
                return (this.currentIndex <= SIZE - 1);
            }

            @Override
            public Integer next() {
                Integer data = dataStructure.array[this.currentIndex];
                this.currentIndex += 2;
                return data;
            }
        });

        System.out.println("LAMBDA EXPRESSION FOR EVEN VALUES ON PRINT EVEN METHOD");
        dataStructure.print((value) -> value % 2 == 0);

        System.out.println("LAMBDA EXPRESSION FOR ODD VALUES ON PRINT EVEN METHOD");
        dataStructure.print((value) -> value % 2 != 0);

        System.out.println("METHOD REFERENCES FOR EVEN VALUES ON PRINT EVEN METHOD");
        dataStructure.print(DataStructure::isEvenIndex);

        System.out.println("METHOD REFERENCES FOR ODD VALUES ON PRINT EVEN METHOD");
        dataStructure.print(DataStructure::isOddIndex);
    }
}
