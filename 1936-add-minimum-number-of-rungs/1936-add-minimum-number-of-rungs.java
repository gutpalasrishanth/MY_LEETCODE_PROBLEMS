class Solution {
    public int addRungs(int[] rungs, int dist) {
        int count=0;
        for(int i=0;i<rungs.length;i++){
            if(i==0){
                if(rungs[i]>dist)
                count+=(rungs[i]-1)/dist;
            }else{
                if(rungs[i]-rungs[i-1]>dist){
                     count+=(rungs[i]-rungs[i-1]-1)/dist;
                }
            }
        }
        return count;
    }
}