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
    public boolean isEvenOddTree(TreeNode root) {
        int level=0;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            int prev;
            if(level%2==0){
                prev=Integer.MIN_VALUE;
            }else{
                prev=Integer.MAX_VALUE;
            }
            for(int i=0;i<n;i++){
                TreeNode curr=q.peek();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                if(level%2==0){
                    if(curr.val<=prev||curr.val%2==0){
                        return false;
                    }
                }else{
                    if(curr.val>=prev||curr.val%2!=0){
                        return false;
                    }
                }
                prev=curr.val;
                q.remove();
            }
            level++;
        }
        return true;
    }
}