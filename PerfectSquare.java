import java.util.Arrays;

/**
 * @id 279
 * @author ranley
 * @level middle
 * @runtime 7ms faster than 97.16%
 */
public class PerfectSquare {
	// method 1: dynamic programming
//	public int numSquares(int n) {
//        int[] dp = new int[n + 1];
//        Arrays.fill(dp, Integer.MAX_VALUE);
//        for(int i = 0; i * i <= n; i++){
//            dp[i * i] = 1;
//        }
//        
//        for(int i = 1; i < dp.length; i++){
//            for(int j = 1; i + j * j <= n; j++){
//                dp[i + j * j] = Math.min(dp[i] + 1, dp[i + j * j]);
//            }
//        }
//        return dp[n];
//    }
	
	// method 2: Recursive with dp 
	static Integer[] dp = new Integer[500000];
    public int numSquares(int n) {
        for(int i = 1; i * i < dp.length; ++i)
            dp[i * i] = 1;
        dp[0] = 0;
        return helper(n, dp);
    }
    
    private int helper(int n, Integer[] dp){
        if(dp[n] != null)
            return dp[n];
        int ans = Integer.MAX_VALUE;
        for(int i = 1; i * i <= n; ++i){
            ans = Math.min(ans, helper(n - i * i, dp) + 1);
        }
        dp[n] = ans;
        return ans;
    }
}
