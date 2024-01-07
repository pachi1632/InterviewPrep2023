package com.example.interview.prep.basicprograms;

// Java code below
// Write your answer here, and then test your code.
// Your job is to implement the findHeight() method.

class FindHeightOfBinaryTree {
    // Change these boolean values to control whether you see
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // Return the maximum depth of the binary tree
    static int findHeight(TreeNode root) {
        // Your code goes here.
        if(root == null){
            return 0;
        } else {
            int leftTreeHeight = findHeight(root.left);
            int rightTreeHeight = findHeight(root.right);
            return leftTreeHeight > rightTreeHeight ? leftTreeHeight + 1 : rightTreeHeight + 1;

        }
    }

    public static void main(String[] args) {


        // This is how your code will be called.
// You can edit this code to try different testing cases.
        FindHeightOfBinaryTree findHeightOfBinaryTree = new FindHeightOfBinaryTree();
        TreeNode root = findHeightOfBinaryTree.new TreeNode(10);
        root.left = findHeightOfBinaryTree.new TreeNode(5);
        root.right = findHeightOfBinaryTree.new TreeNode(15);
        root.left.left = findHeightOfBinaryTree.new TreeNode(3);
        root.left.right = findHeightOfBinaryTree.new TreeNode(7);

        int result = FindHeightOfBinaryTree.findHeight(root);

        System.out.println(result);
    }

}

