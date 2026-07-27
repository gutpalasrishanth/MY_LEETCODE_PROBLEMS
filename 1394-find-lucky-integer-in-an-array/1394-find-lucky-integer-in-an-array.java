class Solution {
    public int findLucky(int[] arr) {
        int count=0;
        int prev=0;
        int maxNum=0;
        for(int i=0;i<arr.length;i++){
            int num=arr[i];
            for(int j=0;j<arr.length;j++){
                if(num==arr[j]){
                    count++;
                }
            }
            if(count==num){
                maxNum=(int)Math.max(prev,count);
                prev=maxNum;
            }
            count=0;
        }
        if(maxNum==0) return -1;
        return maxNum;
    }
}