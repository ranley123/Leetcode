/*
 * @since: July 5th 2018
 * @order: 263
 * @level: easy
 */
public class UglyNumber {
	public static boolean isUgly(int num) {
		if(num == 0) return false;
        if(num == 1) return true;
		while(num != 2 && num != 3 && num != 5 && num != 1) {
			if((num % 2 == 0) || (num % 3 == 0) || (num % 5 == 0)) {
				if(num % 2 == 0) {
					num = num / 2;
				}
				if(num % 3 == 0) {
					num = num / 3;
				}
				
				if(num % 5 == 0) {
					num = num / 5;
				}
			}
			else return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		System.out.print(isUgly(9));
	}
}
