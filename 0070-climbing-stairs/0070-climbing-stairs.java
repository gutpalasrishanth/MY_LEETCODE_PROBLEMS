class Solution {
    public int climbStairs(int n) {
         if(n==1 || n==0){
            return 1;
        }
        int a=0,b=1;
        for(int i=1;i<=n;i++){
            int sum=a+b;
            a=b;
            b=sum;
        }
        return b;
    }
}