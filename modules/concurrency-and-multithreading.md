# Concurrency and Multithreading

## Overview
Concurrency and multithreading in Java allow multiple threads to execute simultaneously, improving the performance of applications. Java provides built-in support for creating and managing threads.

## Key Concepts

- **Thread**: A lightweight process that executes independently.
- **Runnable Interface**: Used to define a task for a thread.
- **Synchronization**: Mechanism to control access to shared resources.
- **Executor Framework**: Simplifies thread management.

## Examples

### Creating a Thread
```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
}
MyThread thread = new MyThread();
thread.start();
```

### Using Runnable Interface
```java
class MyRunnable implements Runnable {
    public void run() {
        System.out.println("Runnable is running");
    }
}
Thread thread = new Thread(new MyRunnable());
thread.start();
```

### Synchronization
```java
synchronized (this) {
    // Critical section
}
```

### Executor Framework
```java
ExecutorService executor = Executors.newFixedThreadPool(2);
executor.submit(() -> System.out.println("Task 1"));
executor.shutdown();
```

## Best Practices

- Minimize the use of `synchronized` blocks to avoid deadlocks.
- Use higher-level concurrency utilities like `java.util.concurrent`.
- Always shut down executors to release resources.

## Additional Resources

- [Java Concurrency Documentation](https://docs.oracle.com/javase/tutorial/essential/concurrency/)
- [Concurrency in Practice by Brian Goetz](https://www.oreilly.com/library/view/java-concurrency-in/0321349601/)
