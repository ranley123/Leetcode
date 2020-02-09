/**
 * @id 213
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class HouseRobber2 {
	public int rob(int[] nums) {
        if (nums == null)
			return 0;
		int n = nums.length;
		if (n == 0)
			return 0;
		if (n == 1)
			return nums[0];
        return Math.max(helper(nums, 0, n - 2), helper(nums, 1, n - 1));
    }
    
    private int helper(int[] nums, int start, int end){
        int n = end - start + 1;
        if(n == 0)
            return 0;
        if(n == 1)
            return nums[start];
        int[] dp = new int[n];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        
        for(int i = 2; i < n; i++){
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        }
        return dp[n - 1];
    }
}
