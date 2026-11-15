class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double ans=0;
        double max=Integer.MIN_VALUE;
        int j=0;
        for(int i=0;i<k&&i<nums.length;i++){
            ans+=nums[i];
            j++;
        }
        int i=0;
        max=Math.max(max,ans);
        while(j<nums.length){
            ans-=nums[i];
            ans+=nums[j];
            max=Math.max(max,ans);
            j++;
            i++;
        }
        return max/k;
    }
}