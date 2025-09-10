# Concurrency and Multithreading

## Overview
Concurrency and multithreading in Java allow multiple threads to execute simultaneously, improving the performance of applications. Java provides built-in support for creating and managing threads.

## Key Concepts

- **Thread**: A lightweight process that executes independently. In Java, threads are instances of the `Thread` class and can be started using the `start()` method. Each thread runs its own code path, allowing multiple operations to occur concurrently.

- **Runnable Interface**: Used to define a task for a thread. By implementing the `Runnable` interface, you separate the task from the thread itself, promoting better design and reusability. The `run()` method contains the code that will execute in the thread.

- **Synchronization**: Mechanism to control access to shared resources. Synchronization ensures that only one thread can access a critical section of code at a time, preventing data inconsistency and race conditions. This is typically achieved using the `synchronized` keyword.

- **Executor Framework**: Simplifies thread management. The Executor framework provides a higher-level API for managing threads, handling thread creation, scheduling, and lifecycle. It includes classes like `ExecutorService` and `Executors` to efficiently manage thread pools and task execution.

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

### Example: Synchronized Method
```java
class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
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
