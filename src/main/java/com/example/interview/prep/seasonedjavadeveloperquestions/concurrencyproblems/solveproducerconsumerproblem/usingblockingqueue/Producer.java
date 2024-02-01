package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingblockingqueue;

import java.util.concurrent.BlockingQueue;

class Producer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Producer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            try {
                queue.put(i);
                System.out.println("Produced " + i);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
