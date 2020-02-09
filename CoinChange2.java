/**
 * @id 518
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class CoinChange2 {
	// method 1: recursion, TLE
//	int counter = 0;
//    public int change(int amount, int[] coins) {
//        helper(amount, coins, 0);
//        return counter;
//    }
//    
//    private void helper(int amount, int[] coins, int start){
//        if(amount == 0){
//            counter++;
//            return;
//        }
//        if(amount < 0 || start == coins.length)
//            return;
//        for(int i = start; i < coins.length; i++){
//            helper(amount - coins[i], coins, i);
//        }
//    }
	
	// method 2: dynamic programming
	public int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int coin: coins){
            for(int i = coin; i < dp.length; i++){
                    dp[i] += dp[i - coin];
            }
        }
        return dp[amount];
    }
}
