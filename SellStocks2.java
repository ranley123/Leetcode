/*
 * @since: July 2nd 2018
 * @level: easy
 * @order: 122
 * Best time to sell
 * When a number is larger than the next one, it can be done by selling and getting the next one bought
 */
public class SellStocks2 {
	public static int maxProfit(int[] prices) {
		int sell = 0;
		int profit = 0;
		
		for(int i = 0; i < prices.length - 1; i++) {
			sell = prices[i];
			for(int j = i + 1; j < prices.length; j++) {
				if(prices[j] < prices[j - 1]) {
					break;
				}
				if(((j < prices.length - 1) && prices[j] > sell && prices[j] > prices[j + 1]) || (j == prices.length - 1 && prices[j] > sell)) {
					sell = prices[j];
					profit = profit + (sell - prices[i]);
					i = j;
					break;
				}
			}
		}
		return profit;
	}
	
	public static void main(String[] args) {
		int[] nums = {6,1,3,2,4,7};
		System.out.println(maxProfit(nums));
	}
}
