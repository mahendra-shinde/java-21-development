# Miscellaneous Topics

## Overview
This module covers various additional topics and features in Java that do not fit into other categories. These include features like the `Optional` class, `var` keyword, and new APIs introduced in recent Java versions.

## Key Concepts

- **Optional Class**: A container object used to represent null or non-null values.
- **Var Keyword**: Allows local variable type inference.
- **New APIs**: Features introduced in Java 9 and later.
- **Process API**: Managing and controlling operating system processes.

## Examples

### Using Optional
```java
Optional<String> optional = Optional.ofNullable(null);
optional.ifPresent(System.out::println);
```

### Using Var Keyword
```java
var list = new ArrayList<String>();
list.add("Hello");
```

### Using Process API
```java
ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");
Process process = processBuilder.start();
```

### Using New APIs
```java
List<String> list = List.of("A", "B", "C");
list.forEach(System.out::println);
```

## Best Practices

- Use `Optional` to avoid null pointer exceptions.
- Use `var` for local variables to improve readability.
- Explore new APIs to simplify code.
- Document miscellaneous features for better understanding.

## Additional Resources

- [Java Optional Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/Optional.html)
- [Java SE Documentation](https://docs.oracle.com/en/java/)
