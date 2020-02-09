/**
 * @id 376
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class WiggleSubsequence {
	public int wiggleMaxLength(int[] nums) {
        int[] up = new int[nums.length];
        int[] down = new int[nums.length];
        
        if(nums.length == 0)
            return 0;
        up[0] = 1;
        down[0] = 1;
        
        for(int i = 1; i < nums.length; i++){
            if(nums[i] > nums[i - 1]){
                up[i] = down[i - 1] + 1;
                down[i] = down[i - 1];
            }
            else if (nums[i] < nums[i - 1]){
                down[i] = up[i - 1] + 1;
                up[i] = up[i - 1];
            }
            else{
                up[i] = up[i - 1];
                down[i] = down[i - 1];
            }
        }
        return Math.max(up[nums.length - 1], down[nums.length - 1]);
    }
}
