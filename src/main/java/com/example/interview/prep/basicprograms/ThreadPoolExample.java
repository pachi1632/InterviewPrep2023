package com.example.interview.prep.basicprograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit tasks to the thread pool
        executor.submit(new MyTask("Task 1"));
        executor.submit(() -> System.out.println("Executing in thread: " + Thread.currentThread().getName()));

        // Shutdown the thread pool
        executor.shutdown();
    }
}

class MyTask implements Runnable {
    private String name;

    public MyTask(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Executing " + name + " in thread: " + Thread.currentThread().getName());
        // Perform the task here
    }
}
