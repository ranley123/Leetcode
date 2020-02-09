/**
 * leetcode 326
 * @author ranley
 * runtime: 10ms faster than 100%
 *
 */
public class PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if (n == 3 || n == 1) {
			return true;
		}
		if (n == 0) {
			return false;
		}
		
		if (n % 3 == 0) {
			n = n / 3;
			return true && isPowerOfThree(n);
		}
		else return false;
	}
	
	public static void main(String[] args) {
		PowerOfThree thing = new PowerOfThree();
		System.out.println(thing.isPowerOfThree(0));
	}
}


