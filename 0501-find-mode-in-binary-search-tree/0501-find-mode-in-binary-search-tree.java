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
    public void ans(TreeNode root,List<Integer> al){
        if(root==null){
            return;
        }
        ans(root.left,al);
        al.add(root.val);
        ans(root.right,al);
    }
    public int[] findMode(TreeNode root) {
        List<Integer> al=new ArrayList<>();
        List<Integer> a=new ArrayList<>();
        ans(root,al);
        int mode=0;
        int i=0;
        while (i<al.size()) {
            int j=i;
            int c=0;
            while (j<al.size()&&al.get(i).equals(al.get(j))) {
                c++;
                j++;
            }
            if (c>mode) {
                mode = c;
                a.clear();
                a.add(al.get(i));
            } else if (c==mode) {
                a.add(al.get(i));
            }
            i=j;
        }
        int arr[] = new int[a.size()];
    for (int k = 0; k < a.size(); k++) {
        arr[k] = a.get(k);
    }
return arr;
    }
}