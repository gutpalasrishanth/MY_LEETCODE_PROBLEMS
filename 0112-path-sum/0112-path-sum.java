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
    static boolean ans(TreeNode root,int tar,int ans){
        if(root==null){
            return false;
        }
        ans+=root.val;
        if(root.left==null&&root.right==null){
            return ans==tar;
        }
        return ans(root.left,tar,ans)||ans(root.right,tar,ans);
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return ans(root,targetSum,0);
    }
}