class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int len=1;
        while(len<=arr.length){
            for(int i=0;i<=arr.length-len;i++){
                for(int j=i;j<i+len;j++){
                    sum+=arr[j];
                }
            }
            len+=2;
        }
        return sum;
    }
}

// class Solution {
//     public int sumOddLengthSubarrays(int[] arr) {
//         int sum1=0;
    
//         for(int i=0;i<arr.length;i++){
//             sum1 = sum1+ arr[i];
//         }
//          int maxs=0;
//         for(int i=0;i<arr.length;i++){
//             int count =1;
//             int sum =0;
//             for(int j=i;j<arr.length;j++){
//                 count++;
//                 if(count%2!=0){
//                     for(int k=j;k>=count;k--){
//                         sum = sum + arr[k];
//                     }

//                 }
//                 maxs = maxs+sum;
//             }
            
//         }
//         return maxs+sum1;
//     }
// }