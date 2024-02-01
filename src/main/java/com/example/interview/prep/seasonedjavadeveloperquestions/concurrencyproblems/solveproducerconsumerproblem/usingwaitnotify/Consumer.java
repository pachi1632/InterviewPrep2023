package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingwaitnotify;

class Consumer implements Runnable {
    private Buffer buffer;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Consumed " + buffer.get());
        }
    }
}
