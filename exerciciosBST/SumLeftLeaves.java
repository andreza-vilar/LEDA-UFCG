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

    public int checkleaf(TreeNode root){
        if(root!=null && root.left==null && root.right==null) return 1;
        return 0;
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        if(checkleaf(root.left)==1) return root.left.val+sum(root.left)+sum(root.right);
        else return sum(root.left)+sum(root.right);
        
    }
    public int sumOfLeftLeaves(TreeNode root) {
        int t=sum(root);
        return t;
    }
}
