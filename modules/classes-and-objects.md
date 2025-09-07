# Classes and Objects

## Overview

Understand the core concepts of object-oriented programming in Java, including classes and objects. This module will provide you with a solid foundation in defining and using classes and objects, along with practical examples.

## Topics Covered
- Defining Classes
- Creating Objects
- Constructors
- Methods and Fields

## Defining Classes

A class is a blueprint for creating objects. Here's how you can define a class in Java:

```java
// Defining a class
public class BankAccount {
    // Fields
    String accountHolderName;
    double balance;

    // Method
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName + ", Balance: $" + balance);
    }
}
```

## Creating Objects

Objects are instances of classes. Here's how you can create and use objects:

```java
public class Main {
    public static void main(String[] args) {
        // Creating an object
        BankAccount account = new BankAccount();
        
        // Setting field values
        account.accountHolderName = "Alice";
        account.balance = 1000.50;

        // Calling a method
        account.displayBalance();
    }
}
```

## Constructors

Constructors are special methods used to initialize objects. Here's an example:

```java
public class BankAccount {
    String accountHolderName;
    double balance;

    // Constructor
    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName + ", Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        // Using the constructor
        BankAccount account = new BankAccount("Bob", 2500.75);
        account.displayBalance();
    }
}
```

## Methods and Fields

Methods define the behavior of a class, while fields store the state. Here's an example:

```java
public class BankAccount {
    // Fields
    String accountHolderName;
    double balance;

    // Method to deposit money
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    // Method to withdraw money
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Method to display balance
    void displayBalance() {
        System.out.println("Account Holder: " + accountHolderName + ", Balance: $" + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountHolderName = "Charlie";
        account.balance = 500.00;

        account.deposit(200.00);
        account.withdraw(100.00);
        account.displayBalance();
    }
}
```

## Practice Exercises

1. Create a `Car` class with fields for `make`, `model`, and `year`. Add a method to display the car's details.
2. Write a program to create a `BankAccount` class with methods to deposit, withdraw, and check the balance.
3. Implement a `Student` class with a constructor and methods to calculate and display the average of three subjects.

## Resources
- [Java Classes and Objects](https://docs.oracle.com/javase/tutorial/java/javaOO/classes.html)
- [Java Constructors](https://docs.oracle.com/javase/tutorial/java/javaOO/constructors.html)
