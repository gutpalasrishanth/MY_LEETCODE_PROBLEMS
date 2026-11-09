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
    TreeNode ans(TreeNode root, int tar) {
        if (root==null) {
            return null;
        }
        root.left=ans(root.left,tar);
        root.right=ans(root.right,tar);
        if(root.val==tar&&root.left==null&&root.right==null) {
            return null;
        }
        return root;
    }
    public TreeNode removeLeafNodes(TreeNode root, int target) {
        ans(root,target);
        if(root.val==target&&root.left==null&&root.right==null){
            return null;
        }
        return root;
    }
}
























