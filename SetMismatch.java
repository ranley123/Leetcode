/**
 * id: 645
 * runtime: 4ms faster than 97.5%
 * @author ranley
 *
 */
public class SetMismatch {
	public int[] findErrorNums(int[] nums) {
        /*
         * this problem is actually rubbish since it does not show specific requirements well
         */
        int[] res = new int[2];
        // since the duplicated number can be stored into exist[0]
        // and the empty spot is the missing number
        // the numbers in nums are continuous
        boolean[] exist = new boolean[nums.length + 1];
        
        for(int i = 0; i < nums.length; i++){
            if(!exist[nums[i]]) exist[nums[i]] = true;
            else res[0] = nums[i];
        }
        
        for(int i = 1; i < nums.length + 1; i++){
            if(!exist[i]) res[1] = i;
        }
        return res;   
    }
}
