import java.util.HashMap;
/*
 * @since: July 3rd 2018
 * @level: easy
 * @order: 169
 * 
 */
public class FindMajorityElement {
	public static int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int result = 0;
		int average = nums.length / 2;
		for(int i = 0; i <= nums.length; i++) {
			if(map.containsKey(nums[i])) {
				map.put(nums[i], map.get(nums[i]) + 1);
			}
			else {
				map.put(nums[i], 1);
			}
			if(map.get(nums[i]) > (average)) {
				result = nums[i];
				break;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		int[] nums = {1};
		System.out.println(majorityElement(nums));
	}
}
