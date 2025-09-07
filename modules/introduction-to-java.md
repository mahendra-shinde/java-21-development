# Introduction to Java

## Overview

Java is a high-level, class-based, object-oriented programming language that is designed to have as few implementation dependencies as possible. It is a widely used programming language for building enterprise-scale applications.


## History and Features of Java

- Java was first released by Sun Microsystems in 1995. Its key features include platform independence (write once, run anywhere), automatic memory management (garbage collection), strong security, and a rich standard library.

- **Example:** Java code is compiled to bytecode, which runs on any system with a Java Virtual Machine (JVM).

### Java Platform Components Diagram

Below is a simple diagram illustrating the relationship between JDK, JRE, and JVM:

```
+---------------------------------------+
|   **JDK (Java Development Kit)**      |
|  - Compiler                           |
|  - Debugger                           |
|  - _JRE_                              |
+---------------------------------------+
         |
         v
+---------------------------------------+
|   **JRE (Java Runtime Environment)**  |
|  - Libraries                          |
|  - _JVM_                              |
+---------------------------------------+
         |
         v
+---------------------------------------+
|   **JVM (Java Virtual Machine)**      |
|  - Executes Bytecode                  |
+---------------------------------------+
```

- **JDK** includes tools for developing Java applications and the JRE.
- **JRE** provides the libraries and JVM required to run Java applications.
- **JVM** is responsible for executing Java bytecode.

## Setting up the Java Development Environment
- To start programming in Java, install the Java Development Kit (JDK) and set up an IDE like IntelliJ IDEA or Eclipse.

- **Example:** Verify installation using the command line:

```sh
java -version
javac -version
```

## Writing Your First Java Program

- Java programs are organized into classes. The entry point is the `main` method.
- **Example:** Writing and running a simple program:

```java
public class Welcome {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
```

## Understanding the Java Virtual Machine (JVM)
- The JVM executes Java bytecode, providing platform independence and security.
- **Example:** Compile and run a Java program:

```sh
javac Welcome.java   # Compiles Welcome.java to Welcome.class (bytecode)
java Welcome         # Runs the bytecode on the JVM
```

## Resources
- [Official Java Documentation](https://docs.oracle.com/en/java/)
