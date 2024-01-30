package com.example.interview.prep.dsa.printingthebottomviewofabinarytree;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class BinaryTree {
    TreeNode root;

    // Method to print the bottom view of the binary tree
    public void printBottomView() {
        if (root == null)
            return;

        // Map to store the last node at each horizontal distance
        Map<Integer, Integer> map = new TreeMap<>();

        // Queue for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        root.horizontalDistance = 0;
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            // Update the map with the last node at this horizontal distance
            map.put(temp.horizontalDistance, temp.value);

            // Add left child to queue
            if (temp.left != null) {
                temp.left.horizontalDistance = temp.horizontalDistance - 1;
                queue.add(temp.left);
            }

            // Add right child to queue
            if (temp.right != null) {
                temp.right.horizontalDistance = temp.horizontalDistance + 1;
                queue.add(temp.right);
            }
        }

        // Print the bottom view
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.print(entry.getValue() + " ");
        }
    }
}
