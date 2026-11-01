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
    static int ans(TreeNode root,int a){
        if(root==null){
            return 0;
        }
        a=a*2+root.val;
        if(root.left==null&&root.right==null){
            return a;
        }
        return ans(root.left,a)+ans(root.right,a);
    }
    public int sumRootToLeaf(TreeNode root) {
        return ans(root,0);
    }
}