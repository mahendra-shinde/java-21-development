# Nested Classes and Lambda Expressions

## Overview

Learn about nested classes and lambda expressions to write concise and readable code.

## Topics Covered
- Static and Non-static Nested Classes
- Anonymous Classes
- Functional Interfaces

## 1. Static and Non-static Nested Classes

Nested classes are classes defined within another class. They help logically group classes that are only used in one place.

**Static Nested Class Example:**
```java
class Outer {
    static class StaticNested {
        void display() {
            System.out.println("Inside static nested class");
        }
    }
}
```

**Non-static (Inner) Class Example:**
```java
class Outer {
    class Inner {
        void display() {
            System.out.println("Inside inner class");
        }
    }
}
```

## 2. Anonymous Classes

Anonymous classes are used to instantiate objects with certain modifications, usually for implementing interfaces or extending classes.

**Example:**
```java
Runnable r = new Runnable() {
    @Override
    public void run() {
        System.out.println("Running in anonymous class");
    }
};
r.run();
```

## 3. Lambda Expressions

Lambda expressions provide a clear and concise way to represent a single method interface using an expression.

**Syntax:**
```java
(parameters) -> expression
```

**Example:**
```java
Runnable r = () -> System.out.println("Running in lambda expression");
r.run();
```

## 4. Functional Interfaces

A functional interface is an interface with a single abstract method, used as the basis for lambda expressions.

**Example:**
```java
@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

Calculator add = (a, b) -> a + b;
System.out.println(add.calculate(5, 3)); // Output: 8
```
- Functional Interfaces

## Resources
- [Java Lambda Expressions](https://docs.oracle.com/javase/tutorial/java/javaOO/lambdaexpressions.html)
