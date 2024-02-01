package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingblockingqueue;

/*
The Producer-Consumer problem is a classic example of a multi-process synchronization problem.
The problem describes two processes, the producer and the consumer, who share a common,
fixed-size buffer used as a queue. The producer generates data, puts it into the buffer,
and starts again. At the same time, the consumer consumes the data (removes it from the buffer),
one piece at a time.

In Java, this problem can be solved using wait/notify mechanism or `BlockingQueue`. I will provide examples for both methods.

### 1. Using `wait` and `notify`

This approach involves using `wait()` and `notify()` methods that are a part of the `Object`
class in Java. These methods are used to coordinate the activities of multiple threads.

```java

```

### 2. Using `BlockingQueue`

`BlockingQueue` is a part of the `java.util.concurrent` package and supports operations that wait
for the queue to become non-empty when retrieving an element and wait for space to become available
in the queue when storing an element.

```java

```

In both examples, the producer and consumer are running in separate threads and communicate through a shared buffer. The first example uses `wait`/`notify` to manually control synchronization, while the second example uses `BlockingQueue` which handles synchronization internally.
*/

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SolveProducerConsumerProblemUsingBlockingQueue {
    public static void main(String[] args) {
        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>(10);
        Thread producerThread = new Thread(new Producer(queue));
        Thread consumerThread = new Thread(new Consumer(queue));

        producerThread.start();
        consumerThread.start();
    }
}









