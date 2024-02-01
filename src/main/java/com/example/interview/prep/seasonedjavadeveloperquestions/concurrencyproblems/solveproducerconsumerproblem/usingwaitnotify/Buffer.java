package com.example.interview.prep.seasonedjavadeveloperquestions.concurrencyproblems.solveproducerconsumerproblem.usingwaitnotify;

class Buffer {
    private int[] buffer;
    private int count = 0;
    private int size;

    public Buffer(int size) {
        buffer = new int[size];
        this.size = size;
    }

    public synchronized void put(int value) {
        while (count == size) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        buffer[count++] = value;
        notify();
    }

    public synchronized int get() {
        while (count == 0) {
            try {
                wait();
            } catch (InterruptedException e) { }
        }
        int value = buffer[--count];
        notify();
        return value;
    }
}
