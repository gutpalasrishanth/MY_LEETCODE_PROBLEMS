class Solution {
    int c=0;
    void ans(int i,int j,int[][] grid){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return;
        }
        if(grid[i][j]==1){
            return;
        }
        grid[i][j]=1;
        ans(i,j+1,grid);
        ans(i,j-1,grid);
        ans(i+1,j,grid);
        ans(i-1,j,grid);
    }
    public int closedIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(i==0||j==0||i==grid.length-1||j==grid[0].length-1){
                    if(grid[i][j]==0){
                        ans(i,j,grid);
                    }
                }
            }
        }
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==0){
                    c++;
                    ans(i,j,grid);
                }
            }
        }
        return c;
    }
}