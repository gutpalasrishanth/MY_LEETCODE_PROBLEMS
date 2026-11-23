class Solution {
    void ans(int i,int j,char[][] mat){
        if(i<0||j<0||i>=mat.length||j>=mat[0].length){
            return;
        }
        if(mat[i][j]=='0'){
            return;
        }
        mat[i][j]='0';
        ans(i,j-1,mat);
        ans(i,j+1,mat);
        ans(i-1,j,mat);
        ans(i+1,j,mat);
    }
    public int numIslands(char[][] grid) {
        int c=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    ans(i,j,grid);
                    c++;
                }
            }
        }
        return c;
    }
}