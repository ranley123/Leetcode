/**
 * @id 201
 * @author ranley
 * @level middle
 * @runtime 4ms faster than 100%
 */
public class BitwiseANDOfNumbersRange {
	public int rangeBitwiseAnd(int m, int n) {
		int counter = 0;
		while(m != n){
			m = m >> 1;
			n = n >> 1;
			counter++;
		}
		return n << counter;
	}
}
