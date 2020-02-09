/**
 * @id 63
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class UniquePaths2 {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if(obstacleGrid[0][0] == 1)
            return 0;
        int rows = obstacleGrid.length;
        int cols = obstacleGrid[0].length;
        int[][] dp = new int[rows][cols];
        dp[0][0] = 1;
        for(int i = 1; i < rows; i++)
            if(obstacleGrid[i][0] != 1)
                dp[i][0] = dp[i - 1][0];
        for(int i = 1; i < cols; i++)
            if(obstacleGrid[0][i] != 1)
                dp[0][i] = dp[0][i - 1];
        for(int i = 1; i < rows; i++){
            for(int j = 1; j < cols; j++){
                if(obstacleGrid[i][j] == 1)
                    continue;
                dp[i][j] = dp[i][j - 1] + dp[i - 1][j];
            }
        }
        return dp[rows - 1][cols - 1];
    }
}
