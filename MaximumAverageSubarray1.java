/**
 * 
 * @author ranley
 * @643
 * @runtime: 2ms faster than 100%
 */
public class MaximumAverageSubarray1 {
	public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i = 0; i < k; i++){
            sum += nums[i];
        }
        int max = sum;
        int left = 0;
        int right = k;
        
        for(; right < nums.length; left++, right++){
            sum = sum + nums[right] - nums[left];
            if(sum > max) max = sum;
        }
        return (double) max/k;
    }
}
