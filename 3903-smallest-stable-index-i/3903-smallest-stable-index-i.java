
class Solution {
    public static int max(int[] arr, int idx) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= idx; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int min(int[] arr, int idx) {
        int min = Integer.MAX_VALUE;
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public int firstStableIndex(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int maxi = max(nums, i);
            int mini = min(nums, i);

            int diff = maxi-mini;

            if (diff<=k) {
                return i;   
            }
        }
        return -1;
    }
}
