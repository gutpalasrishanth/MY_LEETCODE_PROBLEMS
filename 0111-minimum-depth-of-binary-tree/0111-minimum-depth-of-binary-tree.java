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
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        Queue<TreeNode> q=new LinkedList<>();
        int level=0;
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            level++;
            for(int i=0;i<len;i++){
                TreeNode r=q.peek();
                if(r.left==null&&r.right==null){
                    return level;
                }
                if(r.left!=null){
                    q.add(r.left);
                }
                if(r.right!=null){
                    q.add(r.right);
                }
                q.remove();
            }
        }
        return -1;
    }
}