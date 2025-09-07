# Arrays and Loops

## Overview

Master arrays and loop constructs to handle repetitive tasks efficiently. This module will guide you through the basics of arrays and loops, along with practical examples to solidify your understanding.

## Topics Covered
- Declaring and Initializing Arrays
- Iterating with Loops
- Multi-dimensional Arrays
- Enhanced For Loop

## Declaring and Initializing Arrays

Arrays are used to store multiple values of the same type in a single variable. Here's how you can declare and initialize arrays in Java:

```java
// Declaring an array
int[] numbers;

// Initializing an array
numbers = new int[5];

// Declaring and initializing in one step
int[] scores = {90, 80, 70, 60, 50};

// Accessing array elements
System.out.println("First element: " + scores[0]);
```

## Iterating with Loops

Loops are used to iterate over arrays. Here are examples of using `for` and `while` loops:

```java
int[] scores = {90, 80, 70, 60, 50};

// Using a for loop
for (int i = 0; i < scores.length; i++) {
    System.out.println("Score at index " + i + ": " + scores[i]);
}

// Using a while loop
int i = 0;
while (i < scores.length) {
    System.out.println("Score at index " + i + ": " + scores[i]);
    i++;
}
```

## Multi-dimensional Arrays

Multi-dimensional arrays are arrays of arrays. Here's an example:

```java
// Declaring and initializing a 2D array
int[][] matrix = {
    {1, 2, 3},
    {4, 5, 6},
    {7, 8, 9}
};

// Accessing elements
System.out.println("Element at (1, 2): " + matrix[1][2]);

// Iterating over a 2D array
for (int row = 0; row < matrix.length; row++) {
    for (int col = 0; col < matrix[row].length; col++) {
        System.out.print(matrix[row][col] + " ");
    }
    System.out.println();
}
```

## Enhanced For Loop

The enhanced `for` loop simplifies iteration over arrays:

```java
int[] scores = {90, 80, 70, 60, 50};

// Using an enhanced for loop
for (int score : scores) {
    System.out.println("Score: " + score);
}
```

## Practice Exercises

1. Write a program to find the largest number in an array.
2. Create a 2D array and calculate the sum of each row.
3. Use an enhanced for loop to calculate the average of an array of numbers.

## Resources
- [Java Arrays](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)
- [Java Loops](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/flow.html)
