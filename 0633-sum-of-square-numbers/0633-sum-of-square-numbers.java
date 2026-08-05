class Solution {
    public boolean judgeSquareSum(int c) {
        int l=0;
        long r=(int)Math.sqrt(c);
        while(l<=r){
            long ans=l*l+r*r;
            if(ans==c){
                return true;
            }else if(ans>c){
                r--;
            }else{
                l++;
            }
        }
        return false;
    }
}