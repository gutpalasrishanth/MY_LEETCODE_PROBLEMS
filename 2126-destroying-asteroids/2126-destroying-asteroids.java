class Solution {
    public boolean asteroidsDestroyed(int mass, int[] a) {
        Arrays.sort(a);
        long m=mass;
        for(int i=0;i<a.length;i++){
            if(m<a[i]){
                return false;
            }else{
                m+=a[i];
            }
        }
        return true;
    }
}