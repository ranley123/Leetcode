/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 441
 * runtime: 40ms faster than 60%
 * the kth row should have k coins, otherwise return k-1
 */
public class CoinsArranging {
	//use arithmetic way can be really time-consuming
	
	public int arrangeCoins(int n) {
		int rowCount = 1;
        int res = 0;
        while(n > 0){
            n -= rowCount;
            if(n >= 0) res++;
            rowCount++;
        }
        return res;
                
    }
}
