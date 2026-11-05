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
    public int deepestLeavesSum(TreeNode root) {
        int sum=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            int s=0;
            for(int i=0;i<len;i++){
                TreeNode rt=q.peek();
                s+=rt.val;
                if(rt.left!=null) q.add(rt.left);
                if(rt.right!=null) q.add(rt.right);
                q.remove();
                sum=s;
            }
        }
        return sum;
    }
}