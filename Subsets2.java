import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 90
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class Subsets2 {
	List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> curlist = new ArrayList<>();
        Arrays.sort(nums);
        res.add(new ArrayList<Integer>(curlist));
        backtrack(curlist, nums, 0);
        return res;
    }
    
    private void backtrack(List<Integer> curlist, int[] nums, int start){
        if(start == nums.length)
            return;
        
        for(int i = start; i < nums.length; i++){
            if(i != start && nums[i] == nums[i - 1])
                continue;
            curlist.add(nums[i]);
            res.add(new ArrayList<Integer>(curlist));
            backtrack(curlist, nums, i + 1);
            curlist.remove(curlist.size() - 1);
        }
    }
}
