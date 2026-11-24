class Solution {
    int max=0;
    int c=0;
    void ans(int i,int j,int[][] arr){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){
            return;
        }
        if(arr[i][j]==0){
            return;
        }
        c++;
        max=(int)Math.max(max,c);
        arr[i][j]=0;
        ans(i-1,j,arr);
        ans(i+1,j,arr);
        ans(i,j+1,arr);
        ans(i,j-1,arr);
    }
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    ans(i,j,grid);
                    c=0;
                }
            }
        }
        return max;
    }
}