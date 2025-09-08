# Demo 01 : Build and Run Java From Command Line

## Steps to Build and Run the Application

1. **Compile the Java File**:
   Use the following command to compile the Java file and generate `.class` files in the current directory:
   ```bash
   javac FILENAME -d .
   ```
   - `FILENAME` is the name of the Java file you want to compile (e.g., `Main.java`).
   - The `-d .` option specifies that the compiled `.class` files should be placed in the current directory, preserving the package structure.

2. **Run the Application**:
   Use the following command to run the compiled Java application:
   ```bash
   java PACKAGE.className
   ```
   - `PACKAGE` is the package name where the class resides (e.g., `com.example`).
   - `className` is the name of the class containing the `main` method (e.g., `Main`).

## Explanation of Package Structure

In Java, the package structure determines the directory structure for your source files and compiled `.class` files. For example:

- If your Java file is in the package `com.mahendra`, the directory structure should be:
  ```
  com/mahendra/Main.java
  ```
- After compilation, the `.class` file will be placed in the corresponding directory structure:
  ```
  com/mahendra/Main.class
  ```

## Explanation of Commands

- **`javac`**:
  - The `javac` command is used to compile Java source files into bytecode.
  - The `-d` option specifies the destination directory for the compiled `.class` files. Using `.` ensures the current directory is used.

- **`java`**:
  - The `java` command is used to run the Java application.
  - You need to specify the fully qualified class name (including the package) to run the application.

## How JVM runs your Application

When you run a Java application, the Java Virtual Machine (JVM) follows these main steps:

1. **Class Loading**  
   The JVM uses a class loader to find and load your `.class` files (compiled Java code) into memory. The class loader organizes classes and resolves dependencies, allowing dynamic loading as needed.

2. **Bytecode Verification**  
   Before execution, the JVM verifies the bytecode to ensure it is safe and adheres to Java language rules. This prevents illegal operations (like stack overflows or unauthorized memory access) and helps maintain security.

3. **Interpretation and Execution**  
   The JVM interprets the bytecode instructions, translating them into machine code for the host system. Modern JVMs use Just-In-Time (JIT) compilation to optimize performance by compiling frequently used code paths into native code.

**Summary:**  
The JVM loads classes, checks their safety, and then executes them by interpreting or compiling the bytecode, enabling Java applications to run on any platform with a compatible JVM.


