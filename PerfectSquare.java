/*
 * @since: July 4st 2018
 * @order: 367
 * @level: easy
 * 
 */
public class PerfectSquare {
	public boolean isPerfectSquare(int num) {
		int limit =  (int)Math.sqrt(num); 
		if(num == limit * limit) {
			return true;
		}
		else return false;
	}
}
