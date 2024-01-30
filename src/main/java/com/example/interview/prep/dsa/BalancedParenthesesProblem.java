package com.example.interview.prep.dsa;

import java.util.Stack;

public class BalancedParenthesesProblem {

    // Method to check if the expression has balanced parentheses
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expression.toCharArray()) {
            // Check for opening parentheses and push onto the stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                // Check for closing parentheses and pop from the stack
                if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
                    return false;
                }
            }
        }

        // Check if stack is empty, indicating balanced parentheses
        return stack.isEmpty();
    }

    // Helper method to check matching pair of parentheses
    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')') ||
                (opening == '{' && closing == '}') ||
                (opening == '[' && closing == ']');
    }

    public static void main(String[] args) {
        String expression = "{[(2+3)*(1-5)]}";

        if (isBalanced(expression)) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression does not have balanced parentheses.");
        }
    }
}

