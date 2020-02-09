import java.util.HashSet;
import java.util.Set;

/*
 * @since: July 2nd 2018
 * @level: easy
 * @order: 202
 * Notice: we should save the old results
 */
public class HappyNumber {
	public boolean isHappy(int n) {
		Set<Integer> x = new HashSet<>();
		while (n != 1) {
			if (!x.add(n)) {
				return false;
			}
			int sum = 0;
			while (n != 0) {
				int remainder = n % 10;
				sum += Math.pow(remainder, 2);
				n /= 10;
			}
			n = sum;
		}
		return true;
	}
}
