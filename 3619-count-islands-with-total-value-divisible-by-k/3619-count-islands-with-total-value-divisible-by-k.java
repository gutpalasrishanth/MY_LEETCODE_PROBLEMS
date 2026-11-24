class Solution {
    long c=0;
    void ans(int i,int j,int[][] arr){
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length){
            return;
        }
        c+=arr[i][j];
        if(arr[i][j]==0){
            return;
        }
        arr[i][j]=0;
        ans(i-1,j,arr);
        ans(i+1,j,arr);
        ans(i,j+1,arr);
        ans(i,j-1,arr);
    }
    public int countIslands(int[][] grid, int k) {
        int a=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]!=0){
                    ans(i,j,grid);
                    if(c%k==0){
                        a++;
                    }
                    c=0;
                }
            }
        }
        return a;
    }
}