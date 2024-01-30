package com.example.interview.prep.dsa.findingthemaximumdepthofabinarytree;

class BinaryTree {
    TreeNode root;

    // Method to calculate the maximum depth of the tree
    public int maxDepth() {
        return maxDepthRecursive(root);
    }

    // Helper method for calculating the maximum depth recursively
    private int maxDepthRecursive(TreeNode node) {
        if (node == null) {
            return 0;
        }
        int leftDepth = maxDepthRecursive(node.left);
        int rightDepth = maxDepthRecursive(node.right);
        return Math.max(leftDepth, rightDepth) + 1;
    }
}
