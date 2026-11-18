class Solution {
    int max=0;
    void ans(int i,int j,int[][] grid,int sum){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            return;
        }
        sum+=grid[i][j];
         max=Math.max(max,sum);
        if(grid[i][j]==0){
            return;
        }
        int temp =grid[i][j];
        grid[i][j]=0;
        ans(i,j+1,grid,sum);
        ans(i,j-1,grid,sum);
        ans(i+1,j,grid,sum);
        ans(i-1,j,grid,sum);
        grid[i][j]=temp;
    }
    public int getMaximumGold(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    ans(i,j,grid,0);
                }
            }
        }
        return max;
    }
}