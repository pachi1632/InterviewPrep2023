package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingblockingqueue;

import java.util.concurrent.BlockingQueue;

class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                System.out.println("Consumed " + queue.take());
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
