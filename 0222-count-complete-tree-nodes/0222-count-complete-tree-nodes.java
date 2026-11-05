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

    public int leftHeight(TreeNode root) {
        int h=0;
        while(root!=null) {
            h++;
            root=root.left;
        }
        return h;
    }
    public int rightHeight(TreeNode root) {
        int h=0;
        while(root!=null) {
            h++;
            root=root.right;
        }
        return h;
    }

    public int countNodes(TreeNode root) {
        if(root==null)
            return 0;
        int h1=leftHeight(root);
        int h2=rightHeight(root);

        if(h1==h2) {
            return (int)Math.pow(2,h1)-1;
        }
        else {
            return countNodes(root.left)+countNodes(root.right)+1;
        }
    }
}