class Solution {
    public int findSpecialInteger(int[] arr) {
        int max=0;
        int ele=arr[0];
        int i=0;
        while(i<arr.length-1){
            int j=i;
            while(j<arr.length-1&&arr[j]==arr[j+1]){
                j++;
            }
            if(j-i+1>max){
                max=j-i+1;
                ele=arr[j];
            }
            i=j+1;
        }
        return ele;
    }
}