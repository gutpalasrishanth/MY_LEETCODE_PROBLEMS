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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        int level=0;
        if(depth==1){
            TreeNode t=new TreeNode(val);
            t.left=root;
            return t;
        }
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int len=q.size();
            level++;
            for(int i=0;i<len;i++){
                TreeNode s=q.peek();
                if(level==depth-1){
                    TreeNode t=new TreeNode(val);
                    TreeNode temp=s.left;
                    s.left=t;
                    t.left=temp;

                    t=new TreeNode(val);
                    temp=s.right;
                    s.right=t;
                    t.right=temp;
                }
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }
                q.remove();
            }

            if (level==depth-1) {
                break;
            }
        }
        return root;
    }
}