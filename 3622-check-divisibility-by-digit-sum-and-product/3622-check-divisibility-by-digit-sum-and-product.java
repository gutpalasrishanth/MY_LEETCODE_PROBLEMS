class Solution {
    public boolean checkDivisibility(int n) {
        int prod=1;
        int sum=0;
        int num=n;
        while(num!=0){
            int rem=num%10;
            sum+=rem;
            prod*=rem;
            num=num/10;
        }
        return n%(sum+prod)==0;
    }
}