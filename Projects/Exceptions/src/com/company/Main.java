/*
 * What is Exception?
 *
 * An Exception is an event, which occurs during the execution of the program, which disturbs the normal flow of
 * the program execution.
 *
 * **************VALID JAVA PROGRAMMING CODE****************
 * A valid java programming code is the one which honor the "Catch or Specify Requirement"
 *
 * 1. Try statement to "Catch" the exception.
 * 2. A method that "Specifies" that it can throw exception.
 *
 * Three kinds of Exception are:
 * 1. Checked Exception
 * 2. Error Exception
 * 3. Runtime Exception
 *
 * Advantages of Exception Handling
 * 1. Separating Error-Handling code from "Regular Code"
 * 2. Propagation errors up the CALL STACK.
 * 3. Grouping and Differentiating Error Types.
 *
 */
package com.company;

public class Main {

    public static void main(String[] args) {
//        try {
//            System.out.println(divide(100, 0));
//        } catch (MyException myException) {
//            System.out.println("Cause: " + myException.getCause());
//            System.out.println("Message: " + myException.getMessage());
//        } finally {
//            System.out.println("Finally block in main");
//        }

        System.out.println(caller());
        System.out.println("outside exception handling code");
    }

    public static int caller() {
        return divide(100,0);
    }

    public static int divide(Integer a, Integer b) {
        int result = 0;

        try {
            result = a / b;
        } catch (ArithmeticException arithmeticException) {
//            StackTraceElement[] elements = arithmeticException.getStackTrace();
//            for (StackTraceElement element : elements) {
//                System.err.println(element.getFileName() + ":" + element.getLineNumber() +
//                        ">>" + element.getMethodName());
//            }
            arithmeticException.printStackTrace();
        } finally {
            System.out.println("Finally block in divide method");
        }
        return result;
    }
}

class MyException extends Exception {

    public MyException(String message) {
        super(message);
    }

    public MyException(Throwable throwable) {
        super(throwable);
    }

    public MyException(String message, Throwable throwable) {
        super(message, throwable);
    }
}

/*
 * Rules of Finally Block
 * 1. We cannot use multiple finally block with one try-catch.
 * 2. Finally block will be executed even if we use jump statements in try-catch.
 *
 * Cases where finally block will not be executed after try-catch block.
 * 1. If we use System.exit(0), in try block.
 * 2. If some ERROR occurs between program execution.
 * 3. If an exception arises within finally block.
 * 4. Death of a Thread.
 * */

/*
 * What is Throw?
 *
 * Usually it's the method which creates Exception Objects, but we can use throw
 * to create our own Exception objects.
 *
 * throw can be use to create Exception Objects on pre-defined Exceptions classes,
 * but throw is usually use to create User Defined Exception objects and
 * pass it to the JVM.
 *
 * We can only throw classes that is a child of Throwable class.
 *
 * We cannot write any statements after throw, it will produce unreachable error.
 */

/*
 * What is Throws?
 *
 * throws is a keyword used on method declaration which indicates that if you use this method,
 * then this method will throw an Exception, so you must catch it using try-catch block,
 * or specify with the help of throws to successfully compile the program.
 *
 * throws is usually use for Checked Exceptions (Compile Time Exceptions), and if some Unchecked
 * expression occurs, then it is probably because of the programmer mistake.*/
