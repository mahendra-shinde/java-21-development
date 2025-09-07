# Improved Class Design

## Overview

Learn best practices for designing robust and maintainable classes in Java.

This section explores key principles and provides practical examples to help you master class design in Java.

### 1. Encapsulation

Encapsulation hides internal state and requires all interaction to occur through an object's methods.

```java
public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}
```

### 2. Cohesion and Coupling

- **Cohesion**: Classes should have a single, well-defined responsibility.
- **Coupling**: Classes should minimize dependencies on other classes.

```java
// High cohesion: handles only user authentication
public class Authenticator {
    public boolean authenticate(String username, String password) {
        // authentication logic
        return true;
    }
}

// Low coupling: uses Authenticator via interface
public class LoginService {
    private Authenticator authenticator;

    public LoginService(Authenticator authenticator) {
        this.authenticator = authenticator;
    }

    public boolean login(String username, String password) {
        return authenticator.authenticate(username, password);
    }
}
```

### 3. Immutable Classes

Immutable classes cannot be modified after creation, improving thread safety.

```java
public final class Person {
    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}
```

### 4. Design Patterns

Design patterns provide reusable solutions to common problems.

**Example: Singleton Pattern**

```java
public class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }
}
```

**Example: Factory Pattern**

```java
public interface Shape {
    void draw();
}

public class Circle implements Shape {
    public void draw() { System.out.println("Drawing Circle"); }
}

public class ShapeFactory {
    public static Shape getShape(String type) {
        if ("circle".equalsIgnoreCase(type)) {
            return new Circle();
        }
        // Add more shapes as needed
        return null;
    }
}
```

- Encapsulation
- Cohesion and Coupling
- Immutable Classes
- Design Patterns

## Resources
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
