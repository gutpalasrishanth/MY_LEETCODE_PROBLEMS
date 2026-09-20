class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        int i=1;
        for(char ch:s.toCharArray()){
            int n=26-(ch-'a');
            sum+=n*i;
            i++;
        }
        return sum;
    }
}