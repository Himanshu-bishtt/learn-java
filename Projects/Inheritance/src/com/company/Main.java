/*
 * Inheritance is a simple but powerful concept. It helps us to extend classes
 * so that we can use code among other related classes.
 *
 * Java does not support multiple inheritance because it lead to ambiguity.
 * 2 reasons are:
 *
 * i. Multiple Inheritance of State - Means ambiguity caused when a child class extends
 * more than one class and inherits all the fields of all the classes, so if the parent classes
 * have fields with the same name, then compiler will not be able to distinguish.
 *
 * ii. Multiple Inheritance of Implementation - Means ability to inherits methods definition
 * from multiple classes. And leads to same ambiguity of methods names and leads to
 * potential errors.
 *
 * DEFAULT METHODS in Interface introduce one form of multiple inheritance of implementation.
 *
 * Java supports multiple inheritance of type, which is the ability of implement more than one
 * interface.
 *
 * */
package com.company;


public class Main {

    public static void main(String[] args) {
        /*
         * Strings in java programming language are immutable, which means they cannot be
         * changed once the string object is created. However, there are many methods which
         * manipulate the strings, but all they are doing is creating and returning a new
         * string object after performing the operation.
         * */

        /*
         * == is an Equality Operator, is used to define relationship on the basis of the
         * the reference not the value.
         *
         * .equals() methods is used to compare on the basis of the content of the object.
         * */


        /*
         * STRING METHODS
         *
         * // Static methods
         * valueOf()
         * join()
         * trim()
         *
         * // concatenation methods
         * concat()
         * substring()
         * subSequence()
         * join()
         *
         * // removing and replacing methods
         * replace(char existingChar, char replaceWithChar)
         * replace(CharSequence e, CharSequence r)
         * replaceAll()
         * replaceFirst()
         *
         * // Comparing strings methods
         * equals()
         * equalsIgnoreCase()
         * compareTo()
         * compareToIgnoreCase()
         *
         * // character searching methods
         * charAt()
         * indexOf()
         * lastIndexOf()
         * contains()
         * startsWith()
         * endsWith()
         *
         * // case conversion methods
         * toLowerCase()
         * toUpperCase()
         *
         * // type conversion methods
         * valueOf()
         * toCharArray()
         * */

    }
}
