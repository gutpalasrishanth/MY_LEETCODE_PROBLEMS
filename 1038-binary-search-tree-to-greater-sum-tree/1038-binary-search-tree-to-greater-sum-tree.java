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
// class Solution {
//     static void pre(TreeNode root,int s){
//         if(root==null){
//             return;
//         }
//         pre(root.right,s);
//         int temp=root.val;
//         root.val=s+root.val;
//         s+=temp;
//         pre(root.left,s);
//     }
//     public TreeNode bstToGst(TreeNode root) {
//         pre(root,0);
//         return root;
//     }
// }

class Solution {
    static void pre(TreeNode root, int[] s){
        if(root==null){
            return;
        }
        pre(root.right,s);
        int temp=root.val;
        root.val=s[0]+root.val;
        s[0]+=temp;
        pre(root.left,s);
    }
    public TreeNode bstToGst(TreeNode root) {
        int s[]={0};
        pre(root,s);
        return root;
    }
}