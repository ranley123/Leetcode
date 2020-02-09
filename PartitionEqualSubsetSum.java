import java.util.Arrays;

/**
 * @id 416
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 94.17%
 */
public class PartitionEqualSubsetSum {
//	public boolean canPartition(int[] nums) {
//        int sum = 0;
//        for(int num: nums)
//            sum += num;
//        if(sum % 2 != 0)
//            return false;
//        sum = sum / 2;
//        boolean[] dp = new boolean[sum + 1];
//        dp[0] = true;
//        
//        for(int num: nums){
//            for(int i = sum; i - num >= 0; i--){
//                dp[i] = dp[i] || dp[i - num];
//            }
//            if(dp[sum])
//                return true;
//        }
//        return dp[sum];
//    }
	
	// method 2: recursive and dfs
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int num: nums)
            sum += num;
        if(sum % 2 != 0)
            return false;
        sum = sum / 2;
        Arrays.sort(nums);
        return helper(nums, 0, sum);
    }
    
    private boolean helper(int[] nums, int start, int sum){
        if(sum == 0)
            return true;
        if(sum < 0 || start == nums.length)
            return false;
        if(helper(nums, start + 1, sum - nums[start]))
            return true;
        while(start < nums.length - 1 && nums[start + 1] == nums[start])
            start++;
        return helper(nums, start + 1, sum);
    }
}
