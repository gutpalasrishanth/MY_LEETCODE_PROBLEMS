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
    static void ans(TreeNode root,int tar,int sum,List<Integer> al,List<List<Integer>> ll){
        if(root==null){
            return;
        }
        sum+=root.val;
        al.add(root.val);
        if(root.left==null&&root.right==null){
            if(sum==tar){
                ll.add(new ArrayList<>(al));
            }
        }
        ans(root.left,tar,sum,al,ll);
        ans(root.right,tar,sum,al,ll);
        al.remove(al.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ll=new ArrayList<>();
        ans(root,targetSum,0,new ArrayList<>(),ll);
        return ll;
    }
}