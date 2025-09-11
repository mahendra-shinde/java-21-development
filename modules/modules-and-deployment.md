# Modules and Deployment

## Overview
Java modules, introduced in Java 9, enable modular programming by dividing code into smaller, reusable units. Deployment involves packaging and distributing Java applications.

## Key Concepts

- **Module**: A named, reusable unit of code.
- **Module Descriptor**: Defined in `module-info.java`.
- **JAR Files**: Java Archive files for packaging.
- **JLink**: Tool for creating custom runtime images.

## Examples

### Creating a Module
```java
module com.example {
    exports com.example.api;
    requires java.sql;
}
```

### Compiling and Running Modules
```bash
javac -d out --module-source-path src $(find src -name "*.java")
java --module-path out -m com.example/com.example.Main
```

### Creating a JAR File
```bash
jar --create --file app.jar --main-class com.example.Main -C out .
```

### Using JLink
```bash
jlink --module-path $JAVA_HOME/jmods --add-modules com.example --output custom-runtime
```

## Best Practices

- Use modules to encapsulate code and manage dependencies.
- Minimize the use of `requires transitive` to avoid dependency pollution.
- Test modules thoroughly before deployment.


## Additional Resources

- [Java Modules Documentation](https://docs.oracle.com/javase/tutorial/java/module/)
- [Java Deployment Guide](https://docs.oracle.com/javase/tutorial/deployment/)

## CalcModule and Its Usage in Demo13

### Overview
The `CalcModule` is a Java module that provides functionality for mathematical calculations. It exports the `com.mahendra` package, making its classes available to other modules. The `module-info.java` file for `CalcModule` specifies the exported packages and required modules:

```java
module CalcModule {
    exports com.mahendra; // Packages which should be available to Module "Consumers"
    requires java.base;
}
```

### Usage in Demo13
In the `Demo13` project, the `CalcModule` is used to perform subtraction operations. The `Main` class in `Demo13` imports the `Calc` class from the `com.mahendra` package and uses its `doSub` method:

```java
package demo13;

import com.mahendra.Calc;

public class Main {

    public static void main(String[] args) {
        Calc calc = new Calc();
        double ans = calc.doSub(1200, 20);
        System.out.println("Answer: " + ans);
    }
}
```

To run this setup, ensure that the `CalcModule` is available in the module path of the `Demo13` project.

### Steps to Create and Use Modules in Eclipse IDE

1. **Creating a Module**:
   - Open Eclipse IDE and create a new Java project.
   - Right-click the project in the Project Explorer and select `Configure > Create Module`.
   - Provide a name for the module (e.g., `CalcModule`).
   - Add a `module-info.java` file to define the module's exports and requirements.

2. **Adding Classes to the Module**:
   - Create packages and classes within the module as needed.
   - Use the `exports` keyword in `module-info.java` to make specific packages accessible to other modules.

3. **Using a Module in Another Project**:
   - Create a new Java project for the consuming module (e.g., `Demo13`).
   - Right-click the project and select `Properties > Java Build Path > Module Path`.
   - Add the module (e.g., `CalcModule`) to the module path.
   - Import the required classes from the module and use them in your code.

4. **Running the Application**:
   - Ensure that all required modules are available in the module path.
   - Run the main class of the consuming module as a Java application.

By following these steps, you can create modular Java applications and manage dependencies effectively using Eclipse IDE.
