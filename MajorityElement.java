/**
 * @id 169
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class MajorityElement {
	public int majorityElement(int[] nums) {
        int len = nums.length;
        int cur = nums[0];
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                cur = num;
            }
            count += (cur == num) ? 1 : -1;
        }
        return cur;
    }
}
