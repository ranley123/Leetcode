/**
 * @id 190
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class ReverseBits {
	public int reverseBits(int n) {
        int res = 0;
        for(int i = 0; i < 32; i++){
            res = (res << 1) + (n & 1);
            n >>= 1;
        }
        return res;
    }
}
