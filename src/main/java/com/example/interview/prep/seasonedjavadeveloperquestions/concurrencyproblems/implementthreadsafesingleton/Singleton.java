package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.implementthreadsafesingleton;

/*
A thread-safe singleton in Java ensures that only one instance of a class is created, even in a multi-threaded environment. There are several ways to implement a thread-safe singleton. One of the commonly used approaches is using the "Double-Checked Locking" idiom. Here's how you can implement it:

```java

```

In this implementation:

1. The `instance` variable is declared as `volatile`. This ensures that changes made to the instance variable are visible to all threads. It prevents the situation where one thread checks `instance != null`, but it doesn't see the latest value.

2. The private constructor ensures that the Singleton class cannot be instantiated from outside the class.

3. The `getInstance` method is used to access the single instance of the class. Inside this method, double-checked locking is used to create the instance only if it doesn't already exist. The outer `if` statement checks if `instance` is `null`, and if it is, then it enters a synchronized block. Inside the synchronized block, it checks again if `instance` is `null` before creating a new instance. This avoids unnecessary synchronization once the instance has been created.

Using this pattern, you can safely create a thread-safe singleton in Java, and it performs well in multi-threaded scenarios while minimizing synchronization overhead after the instance has been created.
* */

public class Singleton {

    // Private instance variable to hold the single instance
    private volatile static Singleton instance;

    // Private constructor to prevent instantiation from other classes
    private Singleton() {
    }

    // Public method to provide access to the single instance
    public static Singleton getInstance() {
        if (instance == null) {
            // Use synchronized block to ensure thread safety
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Other methods and properties of the Singleton class
    public void doSomething() {
        System.out.println("Singleton is doing something.");
    }
}
