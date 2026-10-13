class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=-nums[i];
            }
        }
            Arrays.sort(nums);
            int mid=nums.length/2;
            long sum=0;
            for(int i=0;i<mid;i++){
                sum-=nums[i]*nums[i];
            }
            for(int i=nums.length-1;i>=mid;i--){
                sum+=nums[i]*nums[i];
            }
        return sum;
    }
}