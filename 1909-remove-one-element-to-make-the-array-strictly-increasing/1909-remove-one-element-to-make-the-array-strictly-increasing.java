class Solution {
    public boolean canBeIncreasing(int[] nums) {
        boolean t=false;
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>=nums[i]){
                if(t){
                    return false;
                }
                t=true;
            }
            if(i>1 && nums[i-2]>=nums[i]){
                nums[i]=nums[i-1];
            }
        }
        return true;
    }
}