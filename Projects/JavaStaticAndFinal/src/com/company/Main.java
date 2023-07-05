/*
*  Static Keyword is used to make class variables or methods, which means members
*  declared as Static belongs to class rather than objects/instance of the class.
*
*  We can use static members directly by the className, because they belong the class.
*
*  Static keyword can be use with variables, methods, innerClasses and interfaces.
*
*  Eg - Methods of Math, Array Classes etc.
*
*  Syntax - ClassName.StaticMember
*
*  Final Keyword is use to restrict the user. And it is used in many contexts.
*
*  1. Variable - Variables which use final keyword are known as final Variables and their
*                values cannot be changed after the constructor is called.
*
*  2. Methods - Methods which use final keyword cannot be overridden by any child child.
*
*  3. Classes - Classes declared as final, cannot be extended.
* */

package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("Main method starting");

        Person person = new Person();

        System.out.println("Owner is " + Person.getName());
        System.out.println("Some Method " + person.someMethod());

        System.out.println("***************************************");

        Person person1 = new Person();

        System.out.println("Owner is " + person1.getName());
        System.out.println("Some Method " + person.someMethod());

        System.out.println("Main method end");
    }
}
