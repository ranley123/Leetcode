/**
 * @id 64
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class MinimumPathSum {
	public int minPathSum(int[][] grid) {
        int[][] dp = new int[grid.length][grid[0].length];
		return helper(grid, 0, 0, dp);
	}

	private static int helper(int[][] grid, int x, int y, int[][] dp) {
		if (x == grid.length || y == grid[0].length) {
			return Integer.MAX_VALUE;
		}
		if (x == grid.length - 1 && y == grid[0].length - 1) {
			return grid[x][y];
		}
		if (dp[x][y] != 0) {
			return dp[x][y];
		}
		return dp[x][y] = Math.min(helper(grid, x + 1, y, dp), helper(grid, x, y + 1, dp)) + grid[x][y];
	}
	
	// method 2:
//	public int minPathSum(int[][] grid) {
//        int[][] dp = new int[grid.length][grid[0].length];
//        dp[0][0] = grid[0][0];
//        for(int i = 1; i < grid.length; i++){
//            dp[i][0] = dp[i - 1][0] + grid[i][0];
//        }
//        for(int i = 1; i < grid[0].length; i++){
//            dp[0][i] = dp[0][i - 1] + grid[0][i];
//        }
//        
//        for(int i = 1; i < grid.length; i++){
//            for(int j = 1; j < grid[0].length; j++){
//                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]) + grid[i][j];
//            }
//        }
//        return dp[dp.length - 1][dp[0].length - 1];
//    }
}
