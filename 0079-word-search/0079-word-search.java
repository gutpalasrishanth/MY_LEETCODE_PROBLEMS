class Solution {
    boolean a;
    void ans(int i,int j,int idx,String tar,char[][] mat){
        if(idx==tar.length()){
            a=true;
            return;
        }
        if(i<0||j<0||i>=mat.length||j>=mat[0].length){
            return;
        }
        if(a){
            return;
        }
        if(mat[i][j]!=tar.charAt(idx)){
            return;
        }
        char temp = mat[i][j];
        mat[i][j] = '@';
        ans(i+1,j,idx+1,tar,mat);
        ans(i,j+1,idx+1,tar,mat);
        ans(i-1,j,idx+1,tar,mat);
        ans(i,j-1,idx+1,tar,mat);
        mat[i][j] = temp;
    }
    public boolean exist(char[][] mat, String word) {
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==word.charAt(0)){
                    ans(i,j,0,word,mat);
                    if(a){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}