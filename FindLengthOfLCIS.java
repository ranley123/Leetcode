/**
 * 
 * @author ranley
 * @id: 674
 * @runtime: 1ms faster than 100%
 */
public class FindLengthOfLCIS {
	public int findLengthOfLCIS(int[] nums) {
        if(nums.length < 2) return nums.length;
        int counter = 1;
        int max = counter;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i-1]) counter++;
            else{
                max = Math.max(max, counter);
                counter = 1;
            }
        }
        max = Math.max(max, counter);
        return max;
    }
}
