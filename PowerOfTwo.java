/**
 * id: 231
 * runtime: 0ms faster than 100%
 * @author ranley
 *
 */
public class PowerOfTwo {
	public boolean isPowerOfTwo(int n) {
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}
