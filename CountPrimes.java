/**
 * id: 204
 * runtime: 7ms faster than 99.7%
 * @author ranley
 *
 */
public class CountPrimes {
	public int countPrimes(int n) {
		if(n < 3) return 0;
		
		boolean[] notPrime = new boolean[n];
		int counter = 1;
		//i += 2, since the odd numbers might be prime while the even ones not
		for(int i = 3; i < n; i += 2) {
			if(!notPrime[i]) {
				counter++;
				for(int j = 3; i * j < n; j += 2) {
					notPrime[i*j] = true;
				}
			}
		}
		return counter;
	}
}
