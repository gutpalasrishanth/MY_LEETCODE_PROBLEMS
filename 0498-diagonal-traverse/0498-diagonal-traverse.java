class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int i=0;
        int j=0;
        int m=mat.length;
        int n=mat[0].length;
        int arr[]=new int[m*n];
        boolean pp=true;
        int k=0;
        while (k < arr.length) {
        if (pp) {
            while (i >= 0 && j < n && k < arr.length) {
                arr[k++] = mat[i][j];
                i--;
                j++;
            }

            if(j==n) {
                i+=2;
                j--;
            }else{
                i++;
            }
            pp = false;
        } else {
            while (i < m && j >= 0 && k < arr.length) {
                arr[k++] = mat[i][j];
                i++;
                j--;
            }

            if (i == m) {
                i--;
                j += 2;
            } else {
                j++;
            }

            pp = true;
        }
    }
        return arr;
    }
}