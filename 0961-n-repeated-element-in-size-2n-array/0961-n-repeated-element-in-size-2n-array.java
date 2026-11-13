class Solution {
    public int repeatedNTimes(int[] nums) {
        Arrays.sort(nums);
        int n1=nums[(nums.length/2)-1];
        int n2=nums[nums.length/2];
        int n3=nums[(nums.length/2)+1];

        if(n1==n2){
            return n1;
        }
        if(n1==n3){
            return n1;
        }
        if(n2==n3){
            return n2;
        }
        return n1;
    }
}