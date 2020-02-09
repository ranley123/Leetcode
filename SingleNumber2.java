/**
 * @id 137
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SingleNumber2 {
	public int singleNumber(int[] nums) {
		int ones = 0, twos = 0;
	    for(int i = 0; i < nums.length; i++){
	        ones = (ones ^ nums[i]) & ~twos;
	        twos = (twos ^ nums[i]) & ~ones;
	    }
	    return ones;
	}
}
