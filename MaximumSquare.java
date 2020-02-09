/**
 * @id 221
 * @author ranley
 * @level middle
 * @runtime 4ms faster than 95.43%
 */
public class MaximumSquare {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0)
            return 0;
        int row = matrix.length;
        int col = matrix[0].length;
        int max = 0;
        int[][] dp = new int[row][col];
        
        for(int i = 0; i < row; i++) {
            if(matrix[i][0]=='1') {
                dp[i][0] = 1;
                max = 1;
            }
        }
        
        for(int j = 0; j < col; j++) {
            if(matrix[0][j]=='1') {
                dp[0][j] = 1;
                max = 1;
            }
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                if(matrix[i][j] == '1'){
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1;
                    max = Math.max(max, dp[i][j]);
                }
                else
                    dp[i][j] = 0;
            }
        }
        return max * max;
    }
}
