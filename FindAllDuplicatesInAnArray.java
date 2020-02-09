import java.util.ArrayList;
import java.util.List;

/**
 * @id 442
 * @author ranley
 * @level middle
 * @runtime 5ms faster than 95%
 */
public class FindAllDuplicatesInAnArray {
	public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < nums.length; i++){
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                res.add(index + 1);
            else
                nums[index] *= -1;
        }
        return res;
    }
}
