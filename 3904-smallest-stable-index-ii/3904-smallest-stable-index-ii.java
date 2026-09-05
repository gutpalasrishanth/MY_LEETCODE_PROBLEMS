class Solution {
    public int firstStableIndex(int[] nums, int k) {
// class Solution {
//     public static int max(int[] arr, int idx) {
//         int max = Integer.MIN_VALUE;

//         for (int i = 0; i <= idx; i++) {
//             if (arr[i] > max) {
//                 max = arr[i];
//             }
//         }

//         return max;
//     }

//     public static int min(int[] arr, int idx) {
//         int min = Integer.MAX_VALUE;

//         for (int i = idx; i < arr.length; i++) {
//             if (arr[i] < min) {
//                 min = arr[i];
//             }
//         }

//         return min;
//     }

//     public int firstStableIndex(int[] nums, int k) {
//         for (int i = 0; i < nums.length; i++) {
//             int maxi = max(nums, i);
//             int mini = min(nums, i);

//             int diff = maxi - mini;

//             if (diff <= k) {
//                 return i;   
//             }
//         }

//         return -1;
//     }
// }

        int[] pre=new int[nums.length];
        int[] suf=new int[nums.length];
        pre[0]=nums[0];
        suf[nums.length-1]=nums[nums.length-1];
        for(int i=1;i<nums.length;i++){
            pre[i]=Math.max(pre[i-1],nums[i]);
        }
        for(int i=nums.length-2;i>=0;i--){
            suf[i]=Math.min(suf[i+1],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            int diff=pre[i]-suf[i];
            if(diff<=k){
                return i;
            }
        }
        return -1;
    }
}