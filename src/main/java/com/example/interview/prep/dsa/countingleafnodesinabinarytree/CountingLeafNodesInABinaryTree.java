package com.example.interview.prep.dsa.countingleafnodesinabinarytree;

public class CountingLeafNodesInABinaryTree {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the tree
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Counting leaf nodes
        System.out.println("Number of leaf nodes: " + tree.countLeafNodes());
    }
}
