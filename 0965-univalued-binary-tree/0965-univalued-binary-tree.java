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
    static boolean pre(TreeNode root,int a){
        if(root ==null){
            return true;
        }
        if(root.val!=a){
            return false;
        }
        return pre(root.left,a)&&pre(root.right,a);
    }
    public boolean isUnivalTree(TreeNode root) {
        int a=root.val;
        return pre(root,a);
    }
}