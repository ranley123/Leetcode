/**
 * @id 494
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class TargetSum {
	// method 1: brute force with recursion
//	int counter = 0;
//    public int findTargetSumWays(int[] nums, int S) {
//        helper(nums, S, 0);
//        return counter;
//    }
//    
//    private void helper(int[] nums, int target, int start){
//        if(start == nums.length){
//            if (target == 0)
//                counter++;
//            return;
//        }
//        
//        helper(nums, target - nums[start], start + 1);
//        helper(nums, target + nums[start], start + 1);
//    }
	
	// method 2: recursion with memorisation
	public int findTargetSumWays(int[] nums, int S) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        if(S > sum || (sum + S) % 2 == 1)
            return 0;
        sum = (sum + S) >> 1;
        int[] dp = new int[sum + 1];
        dp[0] = 1;
        
        for (int num: nums){
            for(int i = sum; i >= num; i--){
                dp[i] += dp[i - num];
            }
        }
        return dp[sum];
    }
}
