class Solution {
    int ans(int[] a1,int i,int[] a2,int j){
        int arr1[]=new int[i+1];
        int arr2[]=new int[i+1];
        for(int k=0;k<=i;k++){
            arr1[k]=a1[k];
            arr2[k]=a2[k];
        }
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int count=0;
        int a=0,b=0;
        while(a<=i&&b<=j){
            if(arr1[a]==arr2[b]){
                count++;
                a++;b++;
            }else if(arr1[a]>arr2[b]){
                b++;
            }else{
                a++;
            }
        }
        return count;
    }
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int arr[]=new int[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=ans(A,i,B,i);
        }
        return arr;
    }
}