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
class BSTIterator {
    ArrayList<Integer> al;
    int k;

    void inorder(TreeNode root) {
        if(root==null) {
            return;
        }
        inorder(root.left);
        al.add(root.val);
        inorder(root.right);
    }
    public BSTIterator(TreeNode root) {
        al=new ArrayList<>();
        k=0;
        inorder(root);
    }
    
    public int next() {
        return al.get(k++);
    }
    
    public boolean hasNext() {
        if(k>=al.size()){
            return false;
        }else{
            return true;
        }
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */