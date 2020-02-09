/**
 * 
 * @author ranley
 * @id: 724
 * @runtime: 1ms faster than 100%
 */
public class PivotIndex {
	public int pivotIndex(int[] nums) {
        if(nums.length == 0) return -1;
        
        int low = 0;
        int sum = 0;
        
        for(int i: nums){
            sum += i;
        }
        
        for(int i = 0; i < nums.length; i++){
            sum -= nums[i];
            if(low == sum) return i;
            low += nums[i];
        }
            
        return -1;
    }
}
