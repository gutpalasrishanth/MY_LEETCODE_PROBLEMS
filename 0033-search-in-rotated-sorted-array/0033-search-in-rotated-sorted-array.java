class Solution {
    public int search(int[] arr, int tar) {
        int i=0;
        int j=arr.length-1;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(arr[mid]==tar){
                return mid;
            }
            if(arr[mid]<arr[j]){
                //right part is sorted
                if(tar>=arr[mid]&&tar<=arr[j]){
                    i = mid+1;
                }else{
                    j = mid-1;
                }
            }else {
                //left part is sorted
                if(tar>=arr[i]&&tar<=arr[mid]){
                    j=mid-1;
                }else{
                    i=mid+1;
                }
            }
        }
        return -1;
    }
}