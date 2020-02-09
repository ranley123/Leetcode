import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 15
 * @author ranley
 * @level middle
 * @runtime 30ms faster than 82.6%
 */
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums.length < 3) return res;
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if(nums[i] > 0) break;
            if(i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i;
            int right = nums.length - 1;
            
            while(left < right){
                if(left == i) left++;
                else if(right == i) right--;
                
                else if(nums[left] + nums[right] + nums[i] == 0){
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[left]);
                    list.add(nums[right]);
                    list.add(nums[i]);
                    res.add(list);
                    while(left < right && nums[left] == nums[left + 1]) left++;
                    left++;
                    while(left < right && nums[right] == nums[right - 1]) right--;
                    right--;
                    
                }
                else if(nums[left] + nums[right] + nums[i] < 0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return res;
    }
}
