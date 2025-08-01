// Last updated: 8/1/2025, 6:44:31 AM
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
    public void flatten(TreeNode root) {
        if (root==null){
            return;
        }
        if (root.left==null && root.right==null){
            return;
        }
        flatten(root.right);
        flatten(root.left);
        TreeNode temp = root.right;
        if (root.left!=null){
            TreeNode lastleft = lastnode(root.left);
            TreeNode leftnode = root.left;
            root.left = null;
            root.right = leftnode;
            lastleft.right = temp;
        }
    }
    public static TreeNode lastnode(TreeNode curr){
        if (curr.right==null){
            return curr;
        }
        return lastnode(curr.right);
    }
    
}