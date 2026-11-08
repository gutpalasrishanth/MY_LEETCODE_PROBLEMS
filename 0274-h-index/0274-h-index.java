class Solution {
    public int hIndex(int[] ci) {
        Arrays.sort(ci);
        for(int i=0;i<ci.length;i++){
            int h=ci.length-i;
            if(ci[i]>=h){
                return h;
            }
        }
        return 0;
    }
}