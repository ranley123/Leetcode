
/**
 * @id 55
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 99.3%
 */
public class JumpGame {
	public boolean canJump(int[] nums) {
		int reach = nums[0];
		for(int i = 1; i < nums.length && reach >= i; i++)
			if(i + nums[i] > reach) 
				reach = i + nums[i]; 
		return reach >= (nums.length-1);
	}
}
