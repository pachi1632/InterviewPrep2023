package com.example.interview.prep.dsa.traversingbinarysearchtree;

import java.util.Stack;

// Class for the binary search tree
class BinarySearchTree {
    TreeNode root;

    // Method to insert a new value
    public void insert(int value) {
        root = insertRecursive(root, value);
    }

    private TreeNode insertRecursive(TreeNode current, int value) {
        if (current == null) {
            return new TreeNode(value);
        }

        if (value < current.value) {
            current.left = insertRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = insertRecursive(current.right, value);
        }

        return current;
    }

    // Non-recursive method for preorder traversal
    public void preorderTraversalNonRecursive() {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            System.out.print(node.value + " ");

            // Push right and left children to the stack
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    // Method for preorder traversal
    public void preorderTraversalRecursive() {
        preorderRecursive(root);
    }

    // Helper method for recursive preorder traversal
    private void preorderRecursive(TreeNode node) {
        if (node != null) {
            System.out.print(node.value + " ");
            preorderRecursive(node.left);
            preorderRecursive(node.right);
        }
    }
}
