class Solution {
    void ans(int i,int j,char[][] b){
        if(i<0||j<0||i>=b.length||j>=b[0].length){
            return;
        }
        if(b[i][j]=='X' || b[i][j]=='P'){
            return;
        }
        b[i][j]='P';
        ans(i,j-1,b);
        ans(i,j+1,b);
        ans(i-1,j,b);
        ans(i+1,j,b);
    }
    public void solve(char[][] b) {
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]=='O'&&(i==0 || j==0 || i==b.length-1 || j==b[0].length-1)){
                    ans(i,j,b);
                }
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j]!='P'){
                    b[i][j]='X';
                }else{
                    b[i][j]='O';
                }
            }
        }
    }
}