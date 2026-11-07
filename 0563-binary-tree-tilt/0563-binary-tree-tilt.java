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
    int tot=0;
    int ans(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=ans(root.left);
        int right=ans(root.right);
        tot+=Math.abs(left-right);
        return root.val+left+right;
    }
    public int findTilt(TreeNode root) {
        int p=ans(root);
        return tot;
    }
}