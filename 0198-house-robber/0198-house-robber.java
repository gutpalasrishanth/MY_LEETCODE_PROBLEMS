class Solution {
    static int house(int[] nums,int idx,int[] memo){
        if(idx>=nums.length){
            return 0;
        }
        if(memo[idx]!=-1){
            return memo[idx];
        }
        memo[idx]=nums[idx]+Math.max(house(nums,idx+2,memo),house(nums,idx+3,memo));
        return memo[idx];
    }
    public int rob(int[] nums) {
        int[] memo=new int[nums.length];
        Arrays.fill(memo,-1);
        return Math.max(house(nums,0,memo),house(nums,1,memo));
    }
}