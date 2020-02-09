/**
 * 
 * @author ranley
 * @id: 1010
 * @runtime: 2ms faster than 99.9%
 */
public class NumPairsDivisibleBy60 {
	public int numPairsDivisibleBy60(int[] time) {
        int counter = 0;
        int[] temp = new int[60];
        
        for (int t : time) {
            counter += temp[(60 - t % 60) % 60]; //understand it by taking several 60 examples
            temp[t % 60] += 1;
        }
        return counter;
    }
}
