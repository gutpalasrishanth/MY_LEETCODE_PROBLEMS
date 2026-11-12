class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        if(nums.length==1){
            return 1;
        }
        int ic=1;
        int dc=1;
        int max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                while(i<nums.length-1&&nums[i]>nums[i+1]){
                    ic++;
                    i++;
                }
                if(i<nums.length-1&&nums[i]<nums[i+1]){
                    i=i-1;
                }
                max=Math.max(ic,max);
                ic=1;
            }else{
                while(i<nums.length-1 &&nums[i]<nums[i+1]){
                    dc++;
                    i++;
                }
                if(i<nums.length-1&&nums[i]>nums[i+1]){
                    i=i-1;
                }
                max=Math.max(dc,max);
                dc=1;
            }
        }
        return max;
    }
}