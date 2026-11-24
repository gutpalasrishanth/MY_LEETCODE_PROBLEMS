class Solution {
    void ans(char[][] b,int i,int j){
        if(i<0||j<0||i>=b.length||j>=b[0].length){
            return;
        }
        if(b[i][j]!='X'){
            return;
        }
        b[i][j]='.';
        ans(b,i,j+1);
        ans(b,i+1,j);
    }
    public int countBattleships(char[][] b) {
        int c=0;
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]=='X'){
                    c++;
                    ans(b,i,j);
                }
            }
        }
        return c;
    }
}