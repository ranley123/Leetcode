/**
 * @id 746
 * @author ranley
 * @level middle
 * @runtime 7ms faster than 99.84%
 */
public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for(int i = 2; i < dp.length; i++){
            if(i != dp.length - 1)
                dp[i] = Math.min(dp[i - 1] + cost[i], dp[i - 2] + cost[i]);
            else
                dp[i] = Math.min(dp[i - 1], dp[i - 2]);
        }
        return dp[dp.length - 1];
    }
}
