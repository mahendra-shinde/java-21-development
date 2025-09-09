# Interfaces and Generics

## Overview

Interfaces and generics are powerful features in Java that help you build flexible, reusable, and type-safe code. In this section, we'll explore these concepts using examples from the banking domain.

### Interfaces in Banking

Interfaces define contracts for classes. For example, a `BankAccount` interface might specify common operations:

```java
public interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
```

Implementing this interface allows different account types to share the same contract:

```java
public class SavingsAccount implements BankAccount {
    // Implementation details
}
public class CheckingAccount implements BankAccount {
    // Implementation details
}
```

### Functional Interfaces

Functional interfaces have a single abstract method and are used with lambda expressions. For example, a transaction processor:

```java
@FunctionalInterface
public interface TransactionProcessor {
    void process(BankAccount account, double amount);
}
```

You can use lambdas to define custom processing logic:

```java
TransactionProcessor depositProcessor = (account, amount) -> account.deposit(amount);
```

### Generics Basics

Generics allow you to write classes and methods that operate on different types. For example, a generic `NotificationService`:

```java
public class NotificationService<T> {
    public void sendNotification(T recipient, String message) {
        // Implementation
    }
}
```

You can use this for different recipient types:

```java
NotificationService<Customer> customerNotifier = new NotificationService<>();
NotificationService<Employee> employeeNotifier = new NotificationService<>();
```

### Advanced Generics

Generics can be combined with interfaces for more flexibility. For example, a generic repository:

```java
public interface Repository<T> {
    void save(T entity);
    T findById(String id);
}
```

Implementations can handle different banking entities:

```java
public class AccountRepository implements Repository<BankAccount> {
    // Implementation
}
public class CustomerRepository implements Repository<Customer> {
    // Implementation
}
```

By using interfaces and generics, you can build banking applications that are easy to extend and maintain.

## Resources
- [Java Generics](https://docs.oracle.com/javase/tutorial/java/generics/index.html)
