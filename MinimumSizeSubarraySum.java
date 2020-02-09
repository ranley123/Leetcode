/**
 * @id 209
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 99.97%
 */
public class MinimumSizeSubarraySum {
	public int minSubArrayLen(int s, int[] nums) {
        int start = 0, end = 0;
        int minlen = nums.length + 1;
        int sum = 0;
        
        for(; end < nums.length; end++){
            sum += nums[end];
            while(sum >= s){
                minlen = Math.min(minlen, end - start + 1);
                sum -= nums[start++];
            }
        }
        
        return minlen == nums.length + 1? 0 : minlen;
    }
}
