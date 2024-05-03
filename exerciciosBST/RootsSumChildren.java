/*You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.

Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.8*\

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean checkTree(TreeNode root) {
        // if root is NULL or it's a leaf node then return true
        if(root == null || (root.left == null && root.right == null)) {
                return true;
        }
        int leftChildData = 0, rightChildData = 0;
        // if left child is not present then 0 is used as data of left child
        if(root.left != null) {
                leftChildData = root.left.val;
        }
        // if right child is not present then 0 is used as data of right child
        if(root.right != null) {
                rightChildData = root.right.val;
        }
        // if the node doesn't satisfy the property
        if(root.val != leftChildData + rightChildData) {
                return false;
        }
        return checkTree(root.left) && checkTree(root.right);
    }
}
