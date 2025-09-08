# Exceptions and Error Handling

## Overview

Learn how to handle errors and exceptions in Java effectively. This module will introduce you to the concepts of exceptions, their types, and how to manage them using try-catch blocks and other mechanisms.

## Topics Covered
- What are Exceptions?
- Types of Exceptions
- Try-Catch Blocks
- Throwing and Catching Exceptions
- Finally Block

## What are Exceptions?

Exceptions are events that disrupt the normal flow of a program. They are objects that describe an error or unexpected event.

```java
// Example of an exception
int result = 10 / 0; // This will throw an ArithmeticException
```

## Types of Exceptions

Java has two main types of exceptions:

1. **Checked Exceptions**: Exceptions that are checked at compile-time.
2. **Unchecked Exceptions**: Exceptions that occur at runtime.

## Try-Catch Blocks

Use try-catch blocks to handle exceptions and prevent program crashes:

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero: " + e.getMessage());
        }
    }
}
```

## Throwing and Catching Exceptions

You can throw exceptions using the `throw` keyword and catch them using try-catch blocks:

```java
public class Main {
    public static void validateAge(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or older.");
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation failed: " + e.getMessage());
        }
    }
}
```

## Finally Block

The `finally` block is used to execute important code, such as closing resources, regardless of whether an exception occurs:

```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
```

## Practice Exercises

1. Write a program to handle `ArrayIndexOutOfBoundsException`.
2. Create a custom exception class and use it in a program.
3. Implement a program that uses a `finally` block to close a file resource.

## Resources
- [Java Exceptions](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Try-Catch in Java](https://docs.oracle.com/javase/tutorial/essential/exceptions/catch.html)
