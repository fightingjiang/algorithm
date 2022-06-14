package 动态规划;

public class minPathSumNC59 {
    public static void main(String[] args) {

    }

    public int minPathSum (int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = matrix[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i-1]+matrix[0][i];
        }
        for(int i=1;i<m;i++){
            dp[i][0]=dp[i-1][0]+matrix[i][0];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j-1],dp[i-1][j])+matrix[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
