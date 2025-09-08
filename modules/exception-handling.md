# Exception Handling

## Overview
Exception handling in Java is a mechanism to handle runtime errors, ensuring the normal flow of the application. It uses `try`, `catch`, `finally`, `throw`, and `throws` keywords to manage exceptions.

## Types of Exceptions

1. **Checked Exceptions**: Exceptions that are checked at compile-time (e.g., `IOException`, `SQLException`).
2. **Unchecked Exceptions**: Exceptions that occur at runtime (e.g., `ArithmeticException`, `NullPointerException`).
3. **Errors**: Serious issues that applications should not try to handle (e.g., `OutOfMemoryError`).

## Syntax

### Basic Try-Catch Block
```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Handle the exception
}
```

### Finally Block
```java
try {
    // Code that may throw an exception
} catch (ExceptionType e) {
    // Handle the exception
} finally {
    // Code that will always execute
}
```

### Throwing an Exception
```java
throw new IllegalArgumentException("Invalid argument");
```

### Declaring Exceptions
```java
public void readFile(String fileName) throws IOException {
    // Code that may throw IOException
}
```

## Best Practices

- Catch specific exceptions instead of using a generic `Exception`.
- Always clean up resources in a `finally` block or use try-with-resources.
- Avoid swallowing exceptions; log or rethrow them.
- Use custom exceptions for application-specific errors.

## Additional Resources

- [Java Exception Handling Documentation](https://docs.oracle.com/javase/tutorial/essential/exceptions/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
