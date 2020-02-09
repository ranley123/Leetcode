/**
 * 
 * @author ranley
 * @id: 53
 * @runtime: 1ms faster than 99%
 */
public class MaxiSubArray {
	public int maxSubArray(int[] nums) {
        // every number in the array has two options: joining in the previous group
        // or create a new group
        // how to choose: the contribute from the current element
        int len;
        if((len = nums.length) == 0) return 0;
        int maxSum = nums[0], prevSum = nums[0];
        for(int i = 1; i < len; i++) {
            prevSum = Math.max(prevSum + nums[i], nums[i]);
            maxSum = Math.max(maxSum, prevSum);
        }
        return maxSum;
    }
	
	public static void main(String [] args) {
		int[] res = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(res));
	}
}
