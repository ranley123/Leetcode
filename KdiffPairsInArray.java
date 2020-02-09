import java.util.Arrays;

/**
 * 
 * @author ranley
 * @id: 532
 * @runtime: 10ms faster than 93.3%
 */
public class KdiffPairsInArray {
	public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        int ans = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i-1]) continue;
            for (int j = i+1; (j < nums.length) && (nums[j] <= nums[i]+k); j++) if (nums[j] == nums[i] + k) {
                ans++;
                break;
            }
        }
        return ans;
    }
}
