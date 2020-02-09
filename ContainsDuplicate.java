import java.util.HashSet;
import java.util.Set;
/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 217
 * @runtime: 5ms faster than 95%
 * check if the array contains duplicate numbers
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
        	Arrays.sort(nums);
        	for(int i = 0; i < nums.length - 1; i++) {
            		if(nums[i] == nums[i+1]) {
                		return true;
            		}
        	}
        	return false;
        
        
        // runtime: 6ms faster than 84%
        /*
		Set<Integer> set = new HashSet<>();
		for(int n: nums){
            if(!set.add(n)) return true;
        }
		return false;
        */
    }
}
