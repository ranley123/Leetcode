import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 40
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 99.95%
 */

public class CombinationSum2 {
	// the only difference between 1 and 2 is that there might be duplicate numbers in candidates
	// and each number may only be used once.
	List<List<Integer>> res = new ArrayList<>();
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<Integer> path = new ArrayList<>();
        if(candidates == null || candidates.length == 0) {
        	return res;
        }
        Arrays.sort(candidates);
        
        find(path, candidates, target, 0);
        System.out.println(res);
        return res;
	}
	
	private void find(List<Integer> path, int[] candidates, int target, int start) {
		if(target < 0)
			return;
		if(target == 0) {
			res.add(new ArrayList<>(path));
			return;
		}
		
		for(int i = start; i < candidates.length; i++) {
			if(target < candidates[i]) {
				return;
			}
			// critical part
			if(i > start && candidates[i] == candidates[i - 1]) {
				continue; // since the previous one is duplicate and it has been tried
			}
			path.add(candidates[i]);
			find(path, candidates, target - candidates[i], i + 1);
			path.remove(path.size() - 1);
		}
	}
	
	public static void main(String[] args) {
    	CombinationSum2 test = new CombinationSum2();
//    	int[] candidates = {10, 1, 2, 7,6,1,5};
    	int[] candidates = {2,5,2,1,2};
    	int target = 5;
    	test.combinationSum2(candidates, target);
    }
}
