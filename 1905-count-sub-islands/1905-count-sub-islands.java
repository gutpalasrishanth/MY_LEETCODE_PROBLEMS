class Solution {
     boolean t=false;
    void ans(int i, int j, int[][] g2, int[][] g1) {
        if (i < 0 || j < 0 || i >= g1.length || j >= g1[0].length) {
            return;
        }
        if (g2[i][j] == 0) {
            return;
        }
        if(g1[i][j]==0){
            t=true;
        }
        g2[i][j] = 0;
        ans(i + 1, j,g2, g1);
        ans(i - 1, j, g2,g1);
        ans(i, j - 1,g2, g1);
        ans(i, j + 1, g2,g1);
    }

    public int countSubIslands(int[][] grid1, int[][] grid2) {
        int ans = 0;
        for (int i = 0; i < grid1.length; i++) {
            for (int j = 0; j < grid1[0].length; j++) {
                if (grid2[i][j] == 1) {
                    t=false;
                    ans(i, j, grid2, grid1);
                    if(!t){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}