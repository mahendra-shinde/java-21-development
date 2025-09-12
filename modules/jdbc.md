# Java Database Connectivity (JDBC)

## Overview
JDBC (Java Database Connectivity) is an API for connecting and executing queries with databases. It provides a standard interface for database access.

## JDBC API vs JDBC Driver

The **JDBC API** is a set of interfaces and classes in the Java standard library that defines how Java applications interact with databases. The **JDBC Driver** is a vendor-specific implementation of these interfaces, enabling communication with a particular database.

- **JDBC API**: Provides a uniform way to access different databases.
- **JDBC Driver**: Translates JDBC calls into database-specific calls.

### Examples of JDBC Drivers

#### MySQL
```java
// MySQL JDBC Driver class
Class.forName("com.mysql.cj.jdbc.Driver");
Connection conn = DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/mydb", "user", "password"
);
```

#### PostgreSQL
```java
// PostgreSQL JDBC Driver class
Class.forName("org.postgresql.Driver");
Connection conn = DriverManager.getConnection(
    "jdbc:postgresql://localhost:5432/mydb", "user", "password"
);
```

#### Oracle Database
```java
// Oracle JDBC Driver class
Class.forName("oracle.jdbc.OracleDriver");
Connection conn = DriverManager.getConnection(
    "jdbc:oracle:thin:@localhost:1521:xe", "user", "password"
);
```

## Key Concepts

- **Driver**: A database-specific implementation of the JDBC API.
- **Connection**: Represents a session with a database.
- **Statement**: Used to execute SQL queries.
- **ResultSet**: Represents the result of a query.

## Examples

### Establishing a Connection
```java
Connection connection = DriverManager.getConnection(
    "jdbc:oracle:thin:@localhost:1521:xe", "user", "password"
);
```

### Executing a Query
```java
Statement statement = connection.createStatement();
ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
while (resultSet.next()) {
    System.out.println(resultSet.getString("username"));
}
```

### Using PreparedStatement
```java
PreparedStatement preparedStatement = connection.prepareStatement(
    "SELECT * FROM users WHERE id = ?"
);
preparedStatement.setInt(1, 1);
ResultSet resultSet = preparedStatement.executeQuery();
```

### Closing Resources
```java
resultSet.close();
statement.close();
connection.close();
```

## Best Practices

- Always close database resources to prevent leaks.
- Use connection pooling for better performance.
- Avoid SQL injection by using `PreparedStatement`.
- Log database operations for debugging and monitoring.

## Additional Resources

- [JDBC Documentation](https://docs.oracle.com/javase/tutorial/jdbc/)
- [Database Access with JDBC](https://www.oreilly.com/library/view/database-access-with/9780596000882/)
