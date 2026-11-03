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
    static TreeNode ans(int nums[],int st,int ed){
        TreeNode root=null;
        if(st<=ed){
            int mid=st+(ed-st)/2;
            root=new TreeNode(nums[mid]);
            root.left=ans(nums,st,mid-1);
            root.right=ans(nums,mid+1,ed);
        }
        return root;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return ans(nums,0,nums.length-1);
    }
}