# File Handling

## Overview

Learn how to work with files in Java, including reading, writing, and managing file operations. This module will introduce you to the `java.io` and `java.nio` packages for file handling.

## Topics Covered
- Reading Files
- Writing Files
- File Operations
- Using `java.nio.file` Package

## Reading Files

You can read files using classes like `FileReader` and `BufferedReader`:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
```

## Writing Files

You can write to files using classes like `FileWriter` and `BufferedWriter`:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("example.txt"))) {
            writer.write("Hello, World!");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}
```

## File Operations

Perform operations like creating, deleting, and checking file properties:

```java
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("example.txt");

        // Check if file exists
        if (file.exists()) {
            System.out.println("File exists.");
        } else {
            System.out.println("File does not exist.");
        }

        // Delete a file
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}
```

## Using `java.nio.file` Package

The `java.nio.file` package provides modern file handling capabilities:

```java
import java.nio.file.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("example.txt");

        try {
            // Read all lines from a file
            Files.lines(path).forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
```

## Practice Exercises

1. Write a program to copy the contents of one file to another.
2. Create a program to list all files in a directory.
3. Implement a program to append text to an existing file.

## Resources
- [Java File I/O](https://docs.oracle.com/javase/tutorial/essential/io/)
- [NIO File Handling](https://docs.oracle.com/javase/tutorial/essential/io/file.html)
