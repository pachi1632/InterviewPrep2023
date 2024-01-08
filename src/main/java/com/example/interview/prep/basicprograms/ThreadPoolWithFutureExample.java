package com.example.interview.prep.basicprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolWithFutureExample {
    public static void main(String[] args) {
        // Create a thread pool with a fixed number of threads
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Create a list of Future objects to hold the results
        List<Future<String>> futures = new ArrayList<>();

        // Submit tasks to the thread pool and collect the Future objects
        futures.add(executor.submit(new MyTask2("Task 1")));
        futures.add(executor.submit(new MyTask2("Task 2")));

        // Collect the results from the Future objects
        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println("Result: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the thread pool
        executor.shutdown();
    }
}

class MyTask2 implements Callable<String> {
    private String name;

    public MyTask2(String name) {
        this.name = name;
    }

    @Override
    public String call() {
        System.out.println("Executing " + name + " in thread: " + Thread.currentThread().getName());
        // Perform the task here
        // Return the result
        return "Result of " + name;
    }
}
