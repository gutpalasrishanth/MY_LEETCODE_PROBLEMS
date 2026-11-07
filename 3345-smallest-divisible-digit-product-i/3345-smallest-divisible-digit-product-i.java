class Solution {
    int prod(int n){
        int prod=1;
        while(n!=0){
            int rem=n%10;
            prod*=rem;
            n=n/10;
        }
        return prod;
    }
    public int smallestNumber(int n, int t) {
        while(prod(n)%t!=0){
            n++;
        }
        return n;
    }
}