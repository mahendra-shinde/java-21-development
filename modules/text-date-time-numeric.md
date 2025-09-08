# Text, Date, Time, and Numeric Objects

## Overview

Explore Java's APIs for handling text, dates, times, and numeric values effectively.

## Topics Covered
- String Manipulation
- Date and Time API

## Section Details

### String Manipulation

Java provides the `String` class for handling and manipulating text. Common operations include concatenation, substring extraction, searching, replacing, and trimming whitespace. Methods like `toUpperCase()`, `toLowerCase()`, `split()`, and `replace()` are frequently used.

```java
String name = " Alice ";
String trimmed = name.trim();
String upper = trimmed.toUpperCase();
System.out.println(upper); // Output: ALICE
```

### Date and Time API

Java's modern date and time API (`java.time` package) offers immutable classes for representing dates, times, and durations. Classes like `LocalDate`, `LocalTime`, and `LocalDateTime` simplify date arithmetic, formatting, and parsing.

```java
LocalDate today = LocalDate.now();
LocalDate nextWeek = today.plusWeeks(1);
System.out.println(nextWeek);
```

### Formatting Numbers

Java supports formatting numbers for display using the `NumberFormat` and `DecimalFormat` classes. These allow for locale-specific formatting, currency representation, and controlling decimal places.

```java
double value = 1234.567;
NumberFormat formatter = NumberFormat.getNumberInstance(Locale.US);
String formatted = formatter.format(value);
System.out.println(formatted); // Output: 1,234.567
```

### Parsing and Validating Input

Parsing converts strings to numeric or date types, while validation ensures input correctness. Java provides methods like `Integer.parseInt()`, `Double.parseDouble()`, and date parsing via `DateTimeFormatter`. Exception handling is essential for robust validation.

```java
String input = "2024-06-15";
try {
    LocalDate date = LocalDate.parse(input);
    System.out.println("Valid date: " + date);
} catch (DateTimeParseException e) {
    System.out.println("Invalid date format.");
}
```

- Parsing and Validating Input

## Resources
- [Java Date and Time](https://docs.oracle.com/javase/tutorial/datetime/)
- [Java String Methods](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/lang/String.html)
- [Number Formatting](https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/text/NumberFormat.html)

## Banking Domain Examples

### 1. Formatting Currency Amounts

```java
import java.text.NumberFormat;
import java.util.Locale;

double accountBalance = 12345.67;
NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(Locale.US);
String formattedBalance = currencyFormatter.format(accountBalance);
System.out.println("Account Balance: " + formattedBalance);
// Output: Account Balance: $12,345.67
```

### 2. Parsing and Validating Transaction Dates

```java
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

String transactionDateStr = "2024-06-15";
try {
    LocalDate transactionDate = LocalDate.parse(transactionDateStr, DateTimeFormatter.ISO_LOCAL_DATE);
    System.out.println("Transaction Date: " + transactionDate);
} catch (DateTimeParseException e) {
    System.out.println("Invalid date format.");
}
```

### 3. Generating Transaction Reference Numbers

```java
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

String customerId = "C12345";
LocalDateTime now = LocalDateTime.now();
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmss");
String referenceNumber = customerId + "-" + now.format(formatter);
System.out.println("Transaction Reference: " + referenceNumber);
// Example Output: Transaction Reference: C12345-20240615123045
```

### 4. Validating Numeric Input for Transfers

```java
String inputAmount = "500.00";
try {
    double amount = Double.parseDouble(inputAmount);
    if (amount > 0) {
        System.out.println("Valid transfer amount: " + amount);
    } else {
        System.out.println("Amount must be positive.");
    }
} catch (NumberFormatException e) {
    System.out.println("Invalid amount entered.");
}
```