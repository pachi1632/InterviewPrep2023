package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingwaitnotify;

class Producer implements Runnable {
    private Buffer buffer;

    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            buffer.put(i);
            System.out.println("Produced " + i);
        }
    }
}
