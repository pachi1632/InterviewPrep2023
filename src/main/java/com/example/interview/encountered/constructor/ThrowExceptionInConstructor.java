package com.example.interview.encountered.constructor;

/*
Q:
What is the output of the following program

A:
class ThrowException {

    public ThrowException() throws IOException {
        System.out.println("Inside ThrowException");
        throw new IOException();
    }
}

public class ThrowExceptionInConstructor extends ThrowException {

    public ThrowExceptionInConstructor() throws IOException {
        System.out.println("Inside ThrowExceptionInConstructor constructor");
        try{
            super();
        } catch (Exception e){
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        ThrowExceptionInConstructor throwExceptionInConstructor = new ThrowExceptionInConstructor();
    }
}

A:
Compilation Error

Tip: Call to 'super()' must be first statement in constructor body
* */

import java.io.IOException;

class ThrowException {

    public ThrowException() throws IOException {
        System.out.println("Inside ThrowException");
        throw new IOException();
    }
}

public class ThrowExceptionInConstructor extends ThrowException {

    public ThrowExceptionInConstructor() throws IOException {
        System.out.println("Inside ThrowExceptionInConstructor constructor");
        try{
            /*super();*/
        } catch (Exception e){
            throw new IOException();
        }
    }

    public static void main(String[] args) {
        try {
            ThrowExceptionInConstructor throwExceptionInConstructor = new ThrowExceptionInConstructor();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
