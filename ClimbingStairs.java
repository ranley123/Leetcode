/**
 * @id 70
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class ClimbingStairs {
	public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        if(n == 1)
            return n;
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for(int i = 3; i < dp.length; i++){
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
