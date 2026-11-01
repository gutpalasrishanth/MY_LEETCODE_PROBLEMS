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
    static int anss(TreeNode root,int ans){
        if(root==null){
            return 0;
        }
        ans=ans*10+root.val;
        if(root.left==null&&root.right==null){
            return ans;
        }
        int left=anss(root.left,ans);
        int right=anss(root.right,ans);
        return left+right;
    }
    public int sumNumbers(TreeNode root) {
        return anss(root,0);
    }
}