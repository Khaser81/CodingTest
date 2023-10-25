package org.example.leetcode.Tree.InvertBinaryTree;

/**
 * 226. Invert Binary Tree
 * Easy
 * 13.2K
 * 189
 * Companies
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) { // Base case: if the tree is empty..最下層まで行くと抜ける。
            return root;
        }
        invertTree(root.left); // Call the function recursively for the left subtree...
        invertTree(root.right); // Call the function recursively for the right subtree...
        // Swapping process...
        TreeNode tmp = root.left; //退避
        root.left = root.right; //left入れ込み
        root.right = tmp; //right入れ込み
        return root;        // Return the root...
    }
}
