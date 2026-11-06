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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> a=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            long s=0;
            for(int i=0;i<len;i++){
                TreeNode rt=q.peek();
                if(rt.left!=null) q.add(rt.left);
                if(rt.right!=null) q.add(rt.right);
                s+=rt.val;
                q.remove();
            }
            a.add(s/(double)len);
        }
        return a;
    }
}