# Collections in Java

The Java Collections Framework provides a set of interfaces and classes to store and manipulate groups of data efficiently. Collections are fundamental for handling dynamic data structures such as lists, sets, and maps.

## Why Use Collections?

- Simplifies data management
- Provides reusable algorithms (sorting, searching, etc.)
- Enables flexible data structures

## Basic Interfaces

### List

An ordered collection that allows duplicate elements.

```java
import java.util.*;

List<String> fruits = new ArrayList<>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Apple"); // Duplicates allowed
System.out.println(fruits); // [Apple, Banana, Apple]
```

### Set

A collection that does not allow duplicate elements.

```java
Set<String> uniqueFruits = new HashSet<>();
uniqueFruits.add("Apple");
uniqueFruits.add("Banana");
uniqueFruits.add("Apple"); // Duplicate ignored
System.out.println(uniqueFruits); // [Apple, Banana]
```

### Map

Stores key-value pairs. Keys are unique.

```java
Map<String, Integer> fruitCounts = new HashMap<>();
fruitCounts.put("Apple", 2);
fruitCounts.put("Banana", 1);
System.out.println(fruitCounts); // {Apple=2, Banana=1}
```

## Iterating Collections

Use iterators or enhanced for-loops to traverse collections.

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

## Stream API Example

Process collections with functional-style operations.

```java
fruits.stream()
      .filter(fruit -> fruit.startsWith("A"))
      .forEach(System.out::println); // Prints fruits starting with 'A'
```
 Collections

## Overview

Explore the Java Collections Framework to manage groups of objects effectively.

## Topics Covered
- List, Set, and Map Interfaces
- Common Implementations
- Iterators
- Stream API with Collections

## Resources
- [Java Collections Framework](https://docs.oracle.com/javase/tutorial/collections/)
