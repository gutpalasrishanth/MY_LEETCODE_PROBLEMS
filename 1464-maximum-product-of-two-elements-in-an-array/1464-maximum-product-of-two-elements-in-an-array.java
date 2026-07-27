class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int prod=(nums[i]-1)*(nums[j]-1);
            max=(int)Math.max(prod,max);
            if(nums[i]>nums[j]){
                j--;
            }else{
                i++;
            }
        }
        return max;
    }
}