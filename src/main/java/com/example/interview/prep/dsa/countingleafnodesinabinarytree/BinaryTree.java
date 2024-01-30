package com.example.interview.prep.dsa.countingleafnodesinabinarytree;

class BinaryTree {
    TreeNode root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // Method to count leaf nodes
    public int countLeafNodes() {
        return countLeafNodesRecursive(root);
    }

    // Helper method for counting leaf nodes recursively
    private int countLeafNodesRecursive(TreeNode node) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return 1;
        }
        return countLeafNodesRecursive(node.left) + countLeafNodesRecursive(node.right);
    }
}
