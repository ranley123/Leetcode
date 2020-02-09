/**
 * @id 
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class CountingBits {
	public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 0; i <= num; i++){
            res[i] = res[i / 2] + i % 2;
        }
        return res;
    }
}
