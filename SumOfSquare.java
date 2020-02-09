/*
 * @since: July 3rd 2018
 * @order: 633
 * @level: easy
 * 
 */
public class SumOfSquare {
	public static boolean judgeSquareSum(int c) {
		
		int limit =  (int)Math.sqrt(c); 
		if(c == limit * limit) {
			return true;
		}
		else {
			//只用了一个for而不是两个，大大减少了时间
			for(int i = 1; i <= limit; i++) {
				int result = (int)Math.sqrt(c - i * i);
				if(c == i * i + result * result) {
					return true;
				}
				
			}
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println(judgeSquareSum(2147483646));
	}
}
