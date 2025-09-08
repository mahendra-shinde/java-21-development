# Java Security

## Overview
Java provides a robust security architecture to protect applications from malicious attacks. It includes features like cryptography, authentication, and access control.

## Key Concepts

- **Cryptography**: Secure data using encryption and hashing.
- **Authentication**: Verify the identity of users or systems.
- **Access Control**: Restrict access to resources.
- **Security Manager**: Enforces security policies.

## Examples

### Using MessageDigest for Hashing
```java
MessageDigest md = MessageDigest.getInstance("SHA-256");
byte[] hash = md.digest("password".getBytes(StandardCharsets.UTF_8));
System.out.println(Base64.getEncoder().encodeToString(hash));
```

### Generating a Key Pair
```java
KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
keyGen.initialize(2048);
KeyPair pair = keyGen.generateKeyPair();
```

### Using Access Control
```java
System.setSecurityManager(new SecurityManager());
System.getProperty("user.home"); // May throw SecurityException
```

## Best Practices

- Use strong encryption algorithms like AES and RSA.
- Avoid hardcoding sensitive information in code.
- Regularly update libraries to patch security vulnerabilities.
- Use a Security Manager to enforce policies.

## Additional Resources

- [Java Security Documentation](https://docs.oracle.com/javase/tutorial/security/)
- [Java Cryptography Architecture](https://docs.oracle.com/javase/8/docs/technotes/guides/security/crypto/CryptoSpec.html)
