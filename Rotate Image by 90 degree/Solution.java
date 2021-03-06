class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] ans = new int[n][n];
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                ans[i][j] = matrix[n-j-1][i];
            }
        }
        for(int i=0; i<n; i++)
        {
            matrix[i] = ans[i];
        }
    }
}