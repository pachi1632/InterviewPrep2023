package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.implementthreadsafesingleton.withoutsynchronized;

/*
Implementing a thread-safe singleton in Java can be done in several ways. One of the most efficient and thread-safe methods is using the Bill Pugh Singleton Implementation, which relies on an inner static helper class. This method takes advantage of the Java memory model's guarantees about class initialization to ensure thread safety without the need for synchronization on every call to the instance method.

Here's how you can implement a thread-safe singleton using this method:

```java

```

In this implementation:

1. The `Singleton` class has a private constructor to prevent it from being instantiated outside the class.
2. The `SingletonHelper` nested static class contains the instance of the singleton class. When the `Singleton` class is loaded, the `SingletonHelper` class is not loaded into memory and only when someone calls the `getInstance` method, this class gets loaded and creates the `Singleton` class instance.
3. This is the most widely used approach for Singleton class as it doesn’t require synchronization.

This method is thread-safe without requiring special language constructs (like `volatile` or `synchronized`).

Another popular thread-safe singleton implementation in Java is using an `enum`. It's by far the simplest way to create a thread-safe singleton in Java:

```java

```

In this `enum` approach, the Java virtual machine handles the creation and ensures thread safety. This method is straightforward to implement and is also the approach recommended by Joshua Bloch, the author of "Effective Java".
* */

public class Singleton {

    private Singleton() {
        // private constructor to prevent instantiation
    }

    private static class SingletonHelper {
        // Nested class is referenced after getInstance() is called
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}


