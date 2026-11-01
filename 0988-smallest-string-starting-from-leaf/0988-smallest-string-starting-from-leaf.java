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
    static void ans(TreeNode root,List<String> ll,String str){
        if(root==null){
            return;
        }
        str = ((char)('a'+root.val)) + str;
        if(root.left==null && root.right==null){
            ll.add(str);
        }
        ans(root.left,ll,str);
        ans(root.right,ll,str);
        str.substring(1,str.length());
    }
    public String smallestFromLeaf(TreeNode root) {
        List<String> ll=new ArrayList<>();
        ans(root,ll,"");
        Collections.sort(ll);
        return ll.get(0);
    }
}