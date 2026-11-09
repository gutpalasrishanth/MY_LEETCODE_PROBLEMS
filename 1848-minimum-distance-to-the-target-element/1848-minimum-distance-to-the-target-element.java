class Solution {
    public int getMinDistance(int[] nums, int target, int start) {
        int j=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                j=Math.min(j,Math.abs(i-start));
            }
        }
        return j;
    }
}