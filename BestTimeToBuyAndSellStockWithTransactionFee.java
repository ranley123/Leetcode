/**
 * @id 714
 * @author ranley
 * @level middle
 * @runtime 5ms faster than 99.69%
 */
public class BestTimeToBuyAndSellStockWithTransactionFee {
	// method 1: dynamic programming with array
//	public int maxProfit(int[] prices, int fee) {
//        int len = prices.length;
//        if(len < 2)
//            return 0;
//        int[] buy = new int[len];
//        int[] sell = new int[len];
//        buy[0] = - prices[0];
//        sell[0] = 0;
//        for(int i = 1; i < len; i++){
//            buy[i] = Math.max(buy[i - 1], sell[i - 1] - prices[i]);
//            sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i] - fee);
//        }
//        return Math.max(buy[len - 1], sell[len - 1]);
//    }
	
	// method 2: dynamic programming with single value
	public int maxProfit(int[] prices, int fee) {
        int len = prices.length;
        if(len < 2)
            return 0;
        int buy = -prices[0];
        int sell = 0;
        for(int i = 1;i < len; i++){
            int price = prices[i];
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }
        return Math.max(buy, sell);
    }
}
