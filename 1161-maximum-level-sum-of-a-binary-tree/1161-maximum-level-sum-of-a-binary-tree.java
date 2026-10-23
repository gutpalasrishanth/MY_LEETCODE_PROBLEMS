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
    public int maxLevelSum(TreeNode root) {
        int max=Integer.MIN_VALUE;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int ans=0;
        int level=0;
        while(!q.isEmpty()){
            int n=q.size();
            int count=0;
            level++;
            for(int i=0;i<n;i++){
                TreeNode curr=q.peek();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                count+=curr.val;
                q.remove();
            }
            if(count>max){
                max=count;
                ans=level;
            }
        }
        return ans;
    }
}