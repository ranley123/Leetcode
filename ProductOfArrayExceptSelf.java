/**
 * @id 238
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class ProductOfArrayExceptSelf {
	public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        if(len == 0)
            return nums;
        int[] forward = new int[len];
        int[] backward = new int[len];
        int[] res = new int[len];
        
        int tempPro = 1;
        backward[0] = 1;
        forward[len - 1] = 1;
        
        for(int i = len - 2; i >= 0; i--){
            tempPro *= nums[i + 1];
            forward[i] = tempPro;
        }
        tempPro = 1;
        for(int i = 1; i < len; i++){
            tempPro *= nums[i - 1];
            backward[i] = tempPro;
        }
        
        for(int i = 0; i < len; i++){
            res[i] = forward[i] * backward[i];
        }
        return res;
    }
}
