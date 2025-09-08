# Advanced Generics

## Overview
Generics in Java provide a way to write flexible and type-safe code. Advanced generics include concepts like bounded type parameters, wildcards, and generic methods.

## Key Concepts

- **Bounded Type Parameters**: Restrict the types that can be used as type arguments.
- **Wildcards**: Represent unknown types.
- **Generic Methods**: Methods that use type parameters.
- **Type Erasure**: The process by which generic types are replaced with raw types at runtime.

## Examples

### Bounded Type Parameters
```java
public <T extends Number> void printNumber(T number) {
    System.out.println(number);
}
```

### Using Wildcards
```java
public void printList(List<?> list) {
    for (Object obj : list) {
        System.out.println(obj);
    }
}
```

### Generic Methods
```java
public static <T> void printArray(T[] array) {
    for (T element : array) {
        System.out.println(element);
    }
}
```

### Type Erasure
```java
List<String> list = new ArrayList<>();
System.out.println(list.getClass()); // Prints class java.util.ArrayList
```

## Best Practices

- Use bounded type parameters to enforce constraints.
- Avoid using raw types to maintain type safety.
- Document generic methods and classes thoroughly.
- Test generic code with different type arguments.

## Additional Resources

- [Java Generics Documentation](https://docs.oracle.com/javase/tutorial/java/generics/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
