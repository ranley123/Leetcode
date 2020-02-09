import java.util.HashMap;

/**
 * 
 * @author ranley
 * @id: 1
 * @runtime: 2ms faster than 99.9%
 */
public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        // use the first Integer to store the number value
        // the second Integer to store the indices
        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];
            if(map.get(diff) != null)
                return new int[] {map.get(diff), i};
            map.put(nums[i], i);
        }
        return null;
    }
}
