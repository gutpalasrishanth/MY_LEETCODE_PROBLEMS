class Solution {
    public int[] plusOne(int[] dig) {
        for(int i=dig.length-1;i>=0;i--){
            if(dig[i]!=9){
                dig[i]++;
                return dig;
            }else{
                dig[i]=0;
            }
        }
        int arr[]=new int[dig.length+1];
        arr[0]=1;
        return arr;
    }
}