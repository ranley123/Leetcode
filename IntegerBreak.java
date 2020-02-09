/**
 * @id 343
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class IntegerBreak {
	// method 1: dynamic programming O(n^2)
    // public int integerBreak(int n) {
    //     int[] dp = new int[n + 1];
    //     for(int i = 1; i < n; i++){
    //         for(int j = 1; j < n; j++){
    //             if(i + j <= n){
    //                 dp[i + j] = Math.max(dp[i + j], Math.max(dp[i], i) * Math.max(dp[j], j));
    //             }
    //         }
    //     }
    //     return dp[n];
    // }
    
    // method 2: dynamic programming O(n)
    public int integerBreak(int n) {
        if(n < 3)
            return 1;
        if(n == 3)
            return 2;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n; i++){
            dp[i] = Math.max(dp[i - 2] * 2, dp[i - 3] * 3);
        }
        return dp[n];
    }
}
