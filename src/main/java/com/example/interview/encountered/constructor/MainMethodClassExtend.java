package com.example.interview.encountered.constructor;
/*
Q:
What is the output of following program

public class SuperMainConstructor {
    public static void main(String[] args) {
        System.out.println("SuperMainConstructor");
    }
}
public class ImplementationClass extends SuperMainConstructor{

}

Ans:
//Answer 1 - if "public" keyword not present before ImplementationClass class
Executes successfully

//Answer 2 - if "public" keyword present before ImplementationClass class
Compilation Error

Tip: Implementation class must not be public if it is in same class

* */
public class MainMethodClassExtend {
    public static void main(String[] args) {
        System.out.println("SuperMainConstructor");
    }
}
class ImplementationClass extends MainMethodClassExtend {

}
