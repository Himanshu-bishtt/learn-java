/*
 * Generics is a concept introduced in Java 5, which motive is provide
 * type safety to the program.
 *
 * Generics gives us the ability to create generic code which is independent of a
 * particular type.
 *
 * It is also known as Parameterized types.
 *
 * We can use Generics with class, methods and interfaces.
 *
 * Prior to Generics ArrayList or other types of list can contain any type of
 * objects, so everytime we have to retrieve the data from the list, we have to
 * type cast it every time, which makes code very complicated and tedious.
 *
 * So after the introduction of Generics we can now have only a specific type of
 * objects in a list which makes it easier for the program.
 *
 * Syntax: ArrayList<Integers> list = new ArrayList<>(); // this can only store integer
 * objects.
 *
 * There are two types of Generics
 * 1. Generic
 * 2. Non-Generics
 *
 * We can provide Generic in three types
 * 1. Lower Bound
 * 2. Upper Bound
 * 3. WildCard
 *
 * */

package com.company;

import java.util.*;
import java.util.List;
import java.util.function.Predicate;

import java.awt.*;
import com.company.mypackage.Rectangle;

public class Main {

    /*
     * Type Parameter and Type Argument
     *
     * ClassName<T> is Type Parameter
     * ClassName<Integer> is Type Argument
     *
     * Invocation of any Generic Type is generally known as Parameterized type.
     *
     * Target Typing is a process in which java compiler expects a data type depending
     * on where the expression appears.
     *
     * Difference between T and ?
     * T is use as Type Parameter for classes, interfaces and methods.
     * ? means WildCard and use for Type Argument for methods.
     *
     * T cannot use super as Bounds
     * ? cannot be use as a type in generic method invocation, generic class instantiation.
     *
     * Reifiable Type means type information is fully known at run time. Eg- Primitive Types,
     * Non-Generic Types.
     *
     * Non-Reifiable Type means type where information is removed at compile time by Type Erasure
     * process. Eg- Generic Types, Bounded Wildcards.
     * */

    public static void main(String[] args) {

        /*
         * List<? extends Number> means list can be of any type which is number or its subtypes.
         * Like Number, Integers, Doubles, Float etc
         *
         * List<? super Number> means list can be of any type which is Number or it superTypes.
         * Like Number, Objects.
         * */

        java.awt.Rectangle rectangle = new java.awt.Rectangle();
        com.company.mypackage.Rectangle rectangle1 = new Rectangle();
    }

    private static <T> int countElements(List<T> list, Predicate<T> tester) {
        int count = 0;
        for (T value : list) {
            if (tester.test(value)) {
                count++;
            }
        }
        return count;
    }

    private static <T extends Number> boolean isPrime(T t) {
        if (t.intValue() <= 1)
            return false;
        for (int i = 2; i <= t.intValue() / 2; ++i) {
            if (t.intValue() % i == 0)
                return false;
        }
        return true;
    }
}

/*
 * 1. What is Generics
 * 2. Type Parameters and Type Arguments
 * 3. Generic Type
 * 4. Generic Methods
 * 5. Bounded Type Parameter
 * 6. Generic Subtyping
 * 7. Type Inference
 *
 * 8. Wildcards
 * 9. UpperBounded Wildcards
 * 10. Unbounded Wildcards
 * 11. LowerBound wildcards
 * 12. Wildcards and Subtyping
 * 13. Wildcard capture.
 *
 * 14. Type Erasure
 * 15. Type Erasure with classes
 * 16. Type Erasure with methods
 * 17. Bridge Methods
 * 18. Non-Reifiable Types- Heap Pollution
 * */
