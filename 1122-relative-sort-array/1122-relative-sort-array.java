class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int nums[]=new int[arr1.length];
        int k=0;
        int p=arr1.length-1;
        for(int i=0;i<arr2.length;i++){
            int c=0;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    c++;
                    arr1[j]=-1;
                }
            }
            while(c!=0){
                nums[k++]=arr2[i];
                c--;
            }
        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=-1){
                nums[k++]=arr1[i];
            }
        }
        return nums;
    }
}