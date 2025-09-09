# Inheritance and Records

## Overview

Dive into inheritance and the use of Java records for data modeling.

## Topics Covered

### Introduction to Records
Records are a special kind of class in Java introduced in Java 14 (as a preview feature) and made stable in Java 16. They are designed to model immutable data.

#### Key Points:
- **Compact Syntax**: Automatically generates constructors, `equals()`, `hashCode()`, and `toString()` methods.
- **Immutable Data**: Fields in a record are final by default.
- **`record` Keyword**: Used to declare a record.

#### Example:
```java
public record Transaction(int id, double amount, String type) {
    // Additional methods can be added if needed
    public String summary() {
        return "Transaction ID: " + id + ", Amount: " + amount + ", Type: " + type;
    }
}

public class Main {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(101, 5000.0, "Credit");
        System.out.println(transaction.id()); // Accessor method
        System.out.println(transaction.amount());
        System.out.println(transaction.summary());
        System.out.println(transaction); // toString() method
    }
}
```

### Basics of Inheritance
Inheritance is a mechanism in Java where one class acquires the properties (fields) and behaviors (methods) of another class. It promotes code reuse and establishes a parent-child relationship between classes.

#### Key Points:
- **Superclass and Subclass**: The class whose properties are inherited is called the superclass, and the class that inherits is called the subclass.
- **`extends` Keyword**: Used to inherit a class.
- **Single Inheritance**: Java supports single inheritance, meaning a class can inherit from only one superclass.
- **`super` Keyword**: Used to call the superclass's methods or constructor.

#### Example:
```java
class Account {
    void displayBalance() {
        System.out.println("Displaying account balance.");
    }
}

class SavingsAccount extends Account {
    void addInterest() {
        System.out.println("Adding interest to savings account.");
    }
}

public class Main {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount();
        savings.displayBalance(); // Inherited method
        savings.addInterest();
    }
}
```

### Overriding Methods
Method overriding allows a subclass to provide a specific implementation of a method already defined in its superclass.

#### Key Points:
- **Annotation**: Use `@Override` to indicate a method is being overridden.
- **Polymorphism**: Enables runtime polymorphism.
- **Rules**: The method must have the same name, return type, and parameters.

#### Example:
```java
class Account {
    void displayAccountType() {
        System.out.println("This is a generic account.");
    }
}

class CurrentAccount extends Account {
    @Override
    void displayAccountType() {
        System.out.println("This is a current account.");
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new CurrentAccount();
        account.displayAccountType(); // Calls the overridden method in CurrentAccount
    }
}
```

### Abstract Classes
Abstract classes are classes that cannot be instantiated. They are used to define a blueprint for other classes.

#### Key Points:
- **Abstract Methods**: Methods without a body that must be implemented by subclasses.
- **Partial Implementation**: Abstract classes can have both abstract and concrete methods.
- **`abstract` Keyword**: Used to declare an abstract class or method.

#### Example:
```java
abstract class Account {
    abstract void calculateInterest(); // Abstract method

    void displayBalance() {
        System.out.println("Displaying account balance.");
    }
}

class FixedDepositAccount extends Account {
    @Override
    void calculateInterest() {
        System.out.println("Calculating interest for fixed deposit account.");
    }
}

public class Main {
    public static void main(String[] args) {
        Account account = new FixedDepositAccount();
        account.calculateInterest();
        account.displayBalance();
    }
}
```


## Resources
- [Java Inheritance](https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html)
- [Java Records](https://docs.oracle.com/en/java/javase/16/language/records.html)
