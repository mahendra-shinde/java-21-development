# Primitive Types and Flow Control

## Overview

Learn about Java's primitive data types, operators, and control flow statements to build the foundation of your programming skills.

## Topics Covered
- Primitive Data Types
- Operators in Java
- Conditional Statements
- Looping Constructs


### Primitive Data Types

Java has eight primitive data types:

| Type     | Size                | Range/Values                                      | Description                    |
|----------|---------------------|---------------------------------------------------|--------------------------------|
| `byte`   | 8-bit               | `-128` to `127`                                   | Integer                        |
| `short`  | 16-bit              | `-32,768` to `32,767`                             | Integer                        |
| `int`    | 32-bit              | `-2,147,483,648` to `2,147,483,647`               | Integer                        |
| `long`   | 64-bit              | `-9,223,372,036,854,775,808` to `9,223,372,036,854,775,807` | Integer                        |
| `float`  | 32-bit              | —                                                 | Floating point                 |
| `double` | 64-bit              | —                                                 | Floating point                 |
| `char`   | 16-bit              | Single Unicode character                          | Character                      |
| `boolean`| 1-bit (logical)     | `true` or `false`                                 | Boolean value                  |

**Example:**

```java
int age = 25;
double price = 19.99;
char grade = 'A';
boolean isJavaFun = true;
```

---

### Operators in Java

Operators perform operations on variables and values.

- **Arithmetic Operators:** `+`, `-`, `*`, `/`, `%`
- **Comparison Operators:** `==`, `!=`, `>`, `<`, `>=`, `<=`
- **Logical Operators:** `&&`, `||`, `!`

**Example:**

```java
int a = 10, b = 5;
int sum = a + b; // 15
boolean isEqual = (a == b); // false
boolean result = (a > b) && (b > 0); // true
```

---

### Conditional Statements

Control the flow of your program using `if`, `else if`, `else`, and `switch`.

**Example:**

```java
int score = 85;
if (score >= 90) {
    System.out.println("Excellent!");
} else if (score >= 75) {
    System.out.println("Good job!");
} else {
    System.out.println("Keep trying!");
}
```

**Switch Statement Example:**

```java
char grade = 'B';
switch (grade) {
    case 'A':
        System.out.println("Great!");
        break;
    case 'B':
        System.out.println("Well done!");
        break;
    default:
        System.out.println("Try harder!");
}
```

---

### Looping Constructs

Loops help you execute code multiple times.

- **for loop**
- **while loop**
- **do-while loop**

**Example:**

```java
for (int i = 0; i < 5; i++) {
    System.out.println("Iteration: " + i);
}

int count = 0;
while (count < 3) {
    System.out.println("Count: " + count);
    count++;
}

int num = 0;
do {
    System.out.println("Num: " + num);
    num++;
} while (num < 2);
```

---

- [Java Operators](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html)
