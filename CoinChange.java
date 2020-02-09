import java.util.Arrays;

/**
 * @id 322
 * @author ranley
 * @level middle
 * @runtime 8ms faster than 92.5%
 */

public class CoinChange {
	// dynamic programming: 8ms faster than 92.5%
	public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        int max = amount + 1;
        Arrays.fill(dp, max);
        dp[0] = 0;
        
        for(int i = 1; i < dp.length; i++){      
            for(int j = 0; j < coins.length; j++){
                if(i >= coins[j])
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
            }
        }
        System.out.println(dp[amount]);
        return dp[amount] > amount ? -1 : dp[amount];
    }
	
	
}
