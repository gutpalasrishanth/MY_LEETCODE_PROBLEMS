class Solution {
    public boolean canMeasureWater(int x, int y, int tar) {
        if(tar>x+y) {
            return false;
        }

        while(y!=0){
            int temp=x;
            x=y;
            y=temp%y;
        }
        return tar%x==0;
    }
}