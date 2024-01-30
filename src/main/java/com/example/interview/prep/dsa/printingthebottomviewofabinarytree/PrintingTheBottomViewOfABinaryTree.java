package com.example.interview.prep.dsa.printingthebottomviewofabinarytree;

public class PrintingTheBottomViewOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construct the binary tree here
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.right = new TreeNode(4);
        tree.root.right.left = new TreeNode(5);

        // Print bottom view
        tree.printBottomView();
    }
}
