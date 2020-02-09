/**
 * 
 * @author ranley
 * @id: 628
 * @runtime: 2ms faster than 100%
 */
public class MaximumProductOfThreeNumbers {
	public int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;  
        int max1 = Integer.MIN_VALUE, max2=Integer.MIN_VALUE, max3=Integer.MIN_VALUE;
        if(nums.length == 3) return nums[0] * nums[1] * nums[2];
        for(int n: nums){
            if(n <= min1){
                min2 = min1;
                min1 = n;
            }
            else if(n < min2)
                min2 = n;
            
            if(n >= max1){
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
            else if(n >= max2){
                max3 = max2;
                max2 = n;
            }
            else if(n > max3)
                max3 = n;
        }
        return Math.max(min1*min2*max1, max1*max2*max3);
        
        /*Arrays.sort(nums);
        int len = nums.length;
        int allpo = nums[len - 1] * nums[len - 2] * nums[len - 3];
        int neg = nums[0] * nums[1] * nums[len - 1];
        return neg > allpo? neg: allpo;*/
    }
}
