/**
 * @id 152
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 90%
 */
public class MaximumProductSubarray {
    // public int maxProduct(int[] nums) {
    //     int max = nums[0];
    //     for(int i = 0; i < nums.length; i++){
    //         int pro = nums[i];
    //         max = Math.max(max, pro);
    //         for(int j = i + 1; j < nums.length; j++){
    //             pro *= nums[j];
    //             max = Math.max(max, pro);
    //         }
    //     }
    //     return max;
    // }
    
    public int maxProduct(int[] nums) {
        if(nums.length == 0)
            return 0;
        int res = nums[0];
        int max = nums[0], min = nums[0];
        for(int i = 1; i < nums.length; i++){
            int temp = max;
            max = Math.max(nums[i], Math.max(min * nums[i], max * nums[i]));
            min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));
            res = Math.max(max, res);
        }
        return res;
    }
}
