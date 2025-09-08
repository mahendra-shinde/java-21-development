# Annotations

## Overview
Annotations in Java provide metadata about the program. They are used by the compiler and runtime to perform specific actions based on the metadata.

## Key Concepts

- **Built-in Annotations**: Predefined annotations like `@Override`, `@Deprecated`, and `@SuppressWarnings`.
- **Custom Annotations**: User-defined annotations for specific use cases.
- **Retention Policies**: Define how long annotations are retained (e.g., `SOURCE`, `CLASS`, `RUNTIME`).
- **Target**: Specifies where an annotation can be applied (e.g., `METHOD`, `FIELD`).

## Examples

### Using Built-in Annotations
```java
@Override
public String toString() {
    return "Example";
}
```

### Creating a Custom Annotation
```java
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation {
    String value();
}
```

### Applying a Custom Annotation
```java
@MyAnnotation("Test")
public void myMethod() {
    // Method implementation
}
```

### Processing Annotations
```java
Method method = MyClass.class.getMethod("myMethod");
MyAnnotation annotation = method.getAnnotation(MyAnnotation.class);
System.out.println(annotation.value());
```

## Best Practices

- Use annotations to improve code readability and maintainability.
- Avoid overusing annotations to prevent clutter.
- Document custom annotations thoroughly.

## Additional Resources

- [Java Annotations Documentation](https://docs.oracle.com/javase/tutorial/java/annotations/)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
