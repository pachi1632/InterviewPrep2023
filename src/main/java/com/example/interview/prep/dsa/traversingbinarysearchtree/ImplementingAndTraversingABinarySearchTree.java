package com.example.interview.prep.dsa.traversingbinarysearchtree;

public class ImplementingAndTraversingABinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        System.out.println("Preorder traversal Non Recursive:");
        bst.preorderTraversalNonRecursive();
        System.out.println("\nPreorder traversal Recursive:");
        bst.preorderTraversalRecursive();
    }
}
