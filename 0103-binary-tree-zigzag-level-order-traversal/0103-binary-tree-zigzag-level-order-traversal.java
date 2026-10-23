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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> al=new ArrayList<>();
        if(root==null){
            return al;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        int p=0;
        while(!q.isEmpty()){
            int n=q.size();
            p++;
            List<Integer> ll=new ArrayList<>();
            for(int i=0;i<n;i++){
                TreeNode curr=q.peek();
                if(curr.left!=null)
                q.add(curr.left);
                if(curr.right!=null)
                q.add(curr.right);
                if(p%2!=0){
                    ll.add(curr.val);
                }else{
                    ll.add(0,curr.val);
                }
                q.remove();
            }
            al.add(ll);
        }
        return al;
    }
}