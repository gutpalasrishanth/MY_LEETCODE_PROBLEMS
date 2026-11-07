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
    void pre(TreeNode root){
        if(root==null){
            return;
        }
        al.add(root.val);
        pre(root.left);
        pre(root.right);
    }
    void ans(TreeNode root,int k){
        if(k>=al.size()){
            return;
        }
        root.right=new TreeNode(al.get(k++));
        root.left=null;
        ans(root.right,k);
    }
    public void flatten(TreeNode root) {
        if(root==null){
            return;
        }
        pre(root);
        ans(root,1);
    }
}