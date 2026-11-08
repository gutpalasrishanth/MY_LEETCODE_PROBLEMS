class Solution {
    int rev(int n){
        int s=0;
        while(n!=0){
            s=s*10+n%10;
            n=n/10;
        }
        return s;
    }
    public int mirrorDistance(int n) {
        int p=rev(n);
        return Math.abs(n-p);
    }
}