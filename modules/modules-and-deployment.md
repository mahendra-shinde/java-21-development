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
