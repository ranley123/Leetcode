/**
 * @id 300
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class LongestIncreasingSubsequence {
	// method 1: brute force TLE
//	public int lengthOfLIS(int[] nums) {
//        return helper(nums, Integer.MIN_VALUE, 0);
//    }
//    
//    private int helper(int[] nums, int prev, int start){
//        System.out.println(prev);
//        if(start == nums.length)
//            return 0;
//        int first = 0;
//        if(nums[start] > prev)
//            first = 1 + helper(nums, nums[start], start + 1);
//        int second = helper(nums, prev, start + 1);
//        return Math.max(first, second);
//    }
	
//	 method 2: dynamic programming 9ms
	public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return 0;
        int[] dp = new int[len];
        int max = 1;
        for(int i = 0; i < len; i++){
            dp[i] = 1;
            for(int j = 0; j < i; j++){
                if(nums[j] < nums[i]){
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
