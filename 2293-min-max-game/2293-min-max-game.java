class Solution {
    public int minMaxGame(int[] arr) {
        int len=arr.length;
        while(len!=1){
            int k=0;
            int iter=0;
            int i=0;
            while(i<len){
                if(iter%2==0){
                    arr[k]=Math.min(arr[i],arr[i+1]);
                    i=i+2;
                }else{
                    arr[k]=Math.max(arr[i],arr[i+1]);
                    i=i+2;
                }
                iter++;
                k++;
            }
            len=len/2;
        }
        return arr[0];
    }
}