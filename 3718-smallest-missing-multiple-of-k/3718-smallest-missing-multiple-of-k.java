class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int sum=k;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==sum){
                sum+=k;
            }
        }
        return sum;
    }
}