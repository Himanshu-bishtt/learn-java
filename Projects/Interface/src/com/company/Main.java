/*
 * InterFace in java is a way to achieve abstraction.
 *
 * Interface is basically a contract that all the methods declared
 * in an InterFace must be defined in a class that implements it.
 *
 * InterFace share IS-A relationship.
 *
 * Also, by InterFace we can achieve multiple Inheritance.
 * */

package com.company;

public class Main {

    public static void main(String[] args) {
        TestClass testClass = new TestClass("Himanshu is my name and i am from New Delhi");
        System.out.println(testClass.getString());
        System.out.println(testClass.subSequence(0, testClass.length()));
    }
}

class TestClass implements java.lang.CharSequence {

    private final String string;

    public TestClass (String s) {
        this.string = s;
    }

    public String getString() {
        return this.string;
    }

    public int length() {
        return this.string.length();
    }

    public char charAt(int index) {
        if (index < 0 || index > this.string.length())
            throw new StringIndexOutOfBoundsException(index);

        return this.string.charAt(index);
    }

    public CharSequence subSequence(int start, int end) {
        if (start < 0)
            throw new StringIndexOutOfBoundsException(start);
        if (end > this.string.length())
            throw new StringIndexOutOfBoundsException(end);
        if (start > end)
            throw new StringIndexOutOfBoundsException(start - end);

        String newString = "";
        for (int i = this.string.length() - 1; i >= 0; --i)
            newString += this.string.charAt(i);

        return newString;
    }

    @Override
    public String toString() {
        return "TestClass{" +
                "string='" + string + '\'' +
                '}';
    }


}
