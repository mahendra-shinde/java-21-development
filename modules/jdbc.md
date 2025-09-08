# Java Database Connectivity (JDBC)

## Overview
JDBC (Java Database Connectivity) is an API for connecting and executing queries with databases. It provides a standard interface for database access.

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
