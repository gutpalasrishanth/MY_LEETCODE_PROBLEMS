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
    ArrayList<Integer> al=new ArrayList<>();
    int k=0;
    void in(TreeNode root){
        if(root==null){
            return;
        }
        in(root.left);
        al.add(root.val);
        in(root.right);
    }
    void pre(TreeNode root){
        if(root==null){
            return;
        }
        pre(root.left);
        root.val=al.get(k++);
        pre(root.right);
    }
    public void recoverTree(TreeNode root) {
        in(root);
        Collections.sort(al);
        pre(root);
    }
}