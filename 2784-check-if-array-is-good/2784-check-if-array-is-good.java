class Solution {
    int[] ans(int n){
        int arr[]=new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=i+1;
        }
        arr[n]=n;
        return arr;
    }
    boolean equals(int[] arr1,int[] arr2){
        if(arr1.length!=arr2.length){
            return false;
        }
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean isGood(int[] nums) {
        int max=-1;
        Arrays.sort(nums);
        max=nums[nums.length-1];
        return equals(nums,ans(max));
    }
}