/**
 * @id 365
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class WaterAndJugProblem {
	public boolean canMeasureWater(int x, int y, int z) {
        if (z > x + y)
			return false;
		if (z == 0)
			return true;
		int res = gcd(x, y);
		return z % res == 0;
    }
    
    public int gcd(int x, int y) {
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		return x;
	}
}
