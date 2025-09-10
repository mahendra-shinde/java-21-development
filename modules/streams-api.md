# Java Streams API

## Overview
The Java Streams API, introduced in Java 8, provides a functional programming approach to processing collections of data. It allows developers to perform operations such as filtering, mapping, and reducing in a concise and readable manner.

## Key Concepts

- **Stream**: A sequence of elements supporting sequential and parallel aggregate operations.
- **Intermediate Operations**: Operations that transform a stream into another stream (e.g., `filter`, `map`).
- **Terminal Operations**: Operations that produce a result or a side-effect (e.g., `collect`, `forEach`).

## Examples

### Creating a Stream
```java
List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
Stream<String> stream = names.stream();
```

### Filtering and Mapping
```java
List<String> filteredNames = names.stream()
    .filter(name -> name.startsWith("A"))
    .map(String::toUpperCase)
    .collect(Collectors.toList());
```

### Reducing
```java
int sum = Arrays.asList(1, 2, 3, 4, 5).stream()
    .reduce(0, Integer::sum);
```

## Parallel Streams

Parallel streams enable concurrent processing of data by leveraging multiple CPU cores. They can be created using the `parallelStream()` method or by calling `.parallel()` on an existing stream.

### Example: Using Parallel Streams
```java
List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
int sum = numbers.parallelStream()
    .mapToInt(Integer::intValue)
    .sum();
```

**Note:** Parallel streams can improve performance for large datasets, but may introduce complexity such as thread-safety concerns and unpredictable ordering.
## Best Practices

- Use parallel streams for large datasets to improve performance.
- Avoid modifying the underlying data source of a stream.
- Close streams that operate on IO channels to prevent resource leaks.

## Additional Resources

- [Java Streams Documentation](https://docs.oracle.com/javase/8/docs/api/java/util/stream/package-summary.html)
- [Oracle Java Tutorials](https://docs.oracle.com/javase/tutorial/collections/streams/)
