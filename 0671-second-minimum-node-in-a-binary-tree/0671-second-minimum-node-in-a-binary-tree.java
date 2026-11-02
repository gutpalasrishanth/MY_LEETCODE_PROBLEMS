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
    int  min=Integer.MAX_VALUE;
    int  secMin=Integer.MAX_VALUE;
    boolean found = false;
    public void preOrder(TreeNode root){
        if(root==null){
            return;
        }
        if(root.val<min){
            secMin=min;
            min=root.val;
        }else if(root.val>min&&root.val<=secMin){
            secMin = root.val;
            found = true;
        }
        preOrder(root.left);
        preOrder(root.right);
    }
    public int findSecondMinimumValue(TreeNode root) {
        preOrder(root);
        if(!found){
            return -1;
        }
        return secMin;
    }
}