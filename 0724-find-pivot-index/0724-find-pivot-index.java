class Solution {
    public int pivotIndex(int[] nums) {
        int arr1[]=new int[nums.length];
        int arr2[]=new int[nums.length];
        arr1[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            arr1[i]=nums[i]+arr1[i-1];
        }
        arr2[nums.length-1]=nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--){
            arr2[i]=arr2[i+1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            int left = (i == 0) ? 0 : arr1[i-1];
            int right = (i == nums.length-1) ? 0 : arr2[i+1];

            if(left == right){
                return i;
            }
        }
        return -1;
    }
}