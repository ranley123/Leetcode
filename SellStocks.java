
/*
 * @since: July 2nd 2018
 * @level: easy
 * @order: 121
 * @runtime: 0ms faster than 100%
 * Best time to sell
 */
public class SellStocks {
	 // method 1: dynamic programming
    // public int maxProfit(int[] prices) {
    //     int len = prices.length;
    //     if(len < 2)
    //         return 0;
    //     int[] buy = new int[len];
    //     int[] sell = new int[len];
    //     buy[0] = -prices[0];
    //     sell[0] = 0;
    //     for(int i = 1; i < len; i++){
    //         buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
    //         sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
    //     }
    //     return Math.max(buy[len - 1], sell[len - 1]);
    // }
    
    public int maxProfit(int[] prices) {
        if (prices.length == 0) return 0;
        int low = prices[0], ans = 0;
        for (int p : prices) {
            if (p < low)
                low = p;
            else {
                ans += p - low;
                low = p;
            }
        }
        return ans;
    }
}
