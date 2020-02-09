/**
 * @id 542
 * @author ranley
 * @level middle
 * @runtime 8ms faster than 90.82%
 */
public class Matrix01 {
	public int[][] updateMatrix(int[][] matrix) {
        int rows = matrix.length;
        if(rows == 0)
            return matrix;
        int cols = matrix[0].length;
        
        int[][] dp = new int[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0)
                    dp[i][j] = 0;
                else{
                    dp[i][j] = rows * cols;
                    if(i > 0)
                        dp[i][j] = Math.min(dp[i - 1][j] + 1, dp[i][j]);
                    if(j > 0)
                        dp[i][j] = Math.min(dp[i][j - 1] + 1, dp[i][j]);
                }
            }
        }
        for(int i = rows - 1; i >= 0; i--){
            for(int j = cols - 1; j >= 0; j--){
                if(matrix[i][j] == 0)
                    continue;
                else{
                    if(i < rows - 1)
                        dp[i][j] = Math.min(dp[i + 1][j] + 1, dp[i][j]);
                    if(j < cols - 1)
                        dp[i][j] = Math.min(dp[i][j + 1] + 1, dp[i][j]);
                }
            }
        }
        return dp;
    }
}
