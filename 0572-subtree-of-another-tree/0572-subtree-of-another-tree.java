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
    static boolean subtree(TreeNode root,TreeNode subTree){
        if(root==null&&subTree==null){
            return true;
        }
        if(root==null&&subTree!=null||root!=null&&subTree==null){
            return false;
        }
        if(root.val!=subTree.val){
            return false;
        }

        return subtree(root.left,subTree.left)&&subtree(root.right,subTree.right);
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        // while(root.val!=subRoot.val&&root.left!=null){
        //     root=root.left;
        // }
        // while(root.val!=subRoot.val&&root.right!=null){
        //     root=root.right;
        // }
        if(root == null) {
            return false;
        }

        if(subtree(root, subRoot)) {
            return true;
        }

        return isSubtree(root.left, subRoot) ||
               isSubtree(root.right, subRoot);
    }
}