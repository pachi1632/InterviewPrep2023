package com.example.interview.encountered.compilationprecedencyorder;

/*
Q: What is the output of the following

        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if(b1 & b2 | b2 & b3 | b2)
            System.out.println("Ok ");
        if(b1 & b2 | b2 & b3 | b2 | b1)
            System.out.println("dokey");

A:
dokey

Tip: All ANDs executed first then all ORs

To understand the output of the given program, let's evaluate the conditional expressions in the `if` statements considering the values of `b1`, `b2`, and `b3`:

- `b1 = true`
- `b2 = false`
- `b3 = true`

### First `if` statement
The expression `b1 & b2 | b2 & b3 | b2` evaluates as follows:
- `b1 & b2` is `true & false`, which is `false`.
- `b2 & b3` is `false & true`, which is `false`.
- `b2` is `false`.

So, `false | false | false` is `false`. Therefore, the first `if` statement does not execute, and "Ok " is not printed.

### Second `if` statement
The expression `b1 & b2 | b2 & b3 | b2 | b1` evaluates as follows:
- `b1 & b2` is `false` (as above).
- `b2 & b3` is `false` (as above).
- `b2` is `false`.
- `b1` is `true`.

So, `false | false | false | true` is `true`. Therefore, the second `if` statement executes, and "dokey" is printed.

**Output:**
```
dokey
```

* */

public class AndOrCompilationPrecedencyOrder {

    public static void main(String[] args) {
        boolean b1 = true;
        boolean b2 = false;
        boolean b3 = true;
        if(b1 & b2 | b2 & b3 | b2)
            System.out.println("Ok ");
        if(b1 & b2 | b2 & b3 | b2 | b1)
            System.out.println("dokey");
    }
}
