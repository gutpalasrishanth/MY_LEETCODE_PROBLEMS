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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q=new LinkedList<>();
        List<List<Integer>> al=new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int n=q.size();
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.peek();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                ll.add(curr.val);
                q.remove();
            }
            al.add(ll);
        }
        return al;
    }
}