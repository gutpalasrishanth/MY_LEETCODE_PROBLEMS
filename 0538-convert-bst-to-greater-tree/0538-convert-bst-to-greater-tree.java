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
    int s=0;
    void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.right);
        s+=root.val;
        root.val=s;
        in(root.left);
    }
    public TreeNode convertBST(TreeNode root) {
        in(root);
        return root;
    }
}