/**
 * id: 268
 * runtime: 0ms faster than 100%
 * @author ranley
 *
 */
public class MissingNumber {
	public int missingNumber(int[] nums) {
        if(nums.length == 1 && nums[0] == 0) return nums[0] + 1;
        if(nums.length == 1 && nums[0] != 0) return nums[0] - 1;
            
        int len = nums.length;
        boolean[] res = new boolean[len + 1];
        for(int n: nums){
            res[n] = true;
        }
        for(int i = 0; i < len; i++){
            if(!res[i]) return i;
        }
        return len;
    }
}
