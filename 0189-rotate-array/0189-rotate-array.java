class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[(i+k)%n]=nums[i];
        }
        System.arraycopy(res,0,nums,0,n);
    }
}