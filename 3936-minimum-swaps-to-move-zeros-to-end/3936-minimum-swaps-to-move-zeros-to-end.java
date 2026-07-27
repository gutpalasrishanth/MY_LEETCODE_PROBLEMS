class Solution {
    public int minimumSwaps(int[] nums) {
        int swaps=0;
        int i=0;
        int j=nums.length-1;
        while(j>i){
            while (i<j&&nums[i]!=0) {
                i++;
            }
            while(i<j&&nums[j]==0){
                j--;
            }
            if(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                swaps++;
                j--;
                i++;
            }
        }
        return swaps;
    }
}