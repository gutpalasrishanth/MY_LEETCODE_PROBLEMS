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
    static void ans(TreeNode root,List<String> ss,String s){
        if(root==null){
            return;
        }
        s=s+root.val;
        if(root.left==null&&root.right==null){
            ss.add(s);
            return;
        }
        s=s+"->";
        ans(root.left,ss,s);
        ans(root.right,ss,s);

    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ss=new ArrayList<>();
        ans(root,ss,"");
        return ss;
    }
}