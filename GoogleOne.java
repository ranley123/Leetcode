import java.util.ArrayList;
import java.util.List;

public class GoogleOne {
	static int sum = 0;
	private static void helper(int[] nums, int limit, int start, int cursum) {
		if(start == nums.length) {
			if(cursum < limit) {
				sum = Math.max(sum, cursum);
			}
			return;
		}
		if(cursum >= limit)
			return;
		sum = Math.max(sum, cursum);
		
		for(int i = start; i < nums.length; i++) {
			cursum += nums[i];
			helper(nums, limit, start + 2, cursum);
			cursum -= nums[i];
		}
	}
	public static void main(String[] args) {
		int[] nums = {50, 80, 21, 30};
		int limit = 100;
		helper(nums, limit, 0, 0);
		System.out.println(sum);
	}
}
