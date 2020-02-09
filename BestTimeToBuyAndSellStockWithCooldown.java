/**
 * @id 309
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class BestTimeToBuyAndSellStockWithCooldown {
	// dynamic programming with memory
	//  public int maxProfit(int[] prices) {
	//      int len = prices.length;
	//      if(len <= 1)
	//          return 0;
	//      int[] buy = new int[len];
	//      int[] sell = new int[len];
	//      buy[0] = -prices[0];
	//      buy[1] = Math.max(-prices[0], -prices[1]);
	//      sell[0] = 0;
	//      sell[1] = Math.max(sell[0], prices[1] - prices[0]);

	//      for(int i = 2; i < len; i++){
	//          buy[i] = Math.max(buy[i - 1], sell[i - 2] - prices[i]);
	//          sell[i] = Math.max(sell[i - 1], buy[i - 1] + prices[i]);
	//      }
	//      return Math.max(buy[len - 1], sell[len - 1]);
	//  }

	// dynamic programming with less memory
	public int maxProfit(int[] prices) {
		int len = prices.length;
		if(len <= 1)
			return 0;
		int buy1 = -prices[0];
		int buy2 = Math.max(-prices[0], -prices[1]);
		int sell1 = 0, sell2 = 0, sell3 = 0;

		for(int i = 1; i < len; i++){
			buy2 = Math.max(buy1, sell1 - prices[i]);
			sell3 = Math.max(sell2, buy1 + prices[i]);
			buy1 = buy2;
			sell1 = sell2;
			sell2 = sell3;
		}
		return Math.max(buy2, sell3);
	}
}
