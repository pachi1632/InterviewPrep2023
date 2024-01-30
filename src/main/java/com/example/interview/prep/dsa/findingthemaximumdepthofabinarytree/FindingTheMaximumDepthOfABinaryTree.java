package com.example.interview.prep.dsa.findingthemaximumdepthofabinarytree;

public class FindingTheMaximumDepthOfABinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Calculating the maximum depth
        System.out.println("Maximum depth of the tree: " + tree.maxDepth());
    }
}
