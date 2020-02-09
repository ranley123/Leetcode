import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @id 39
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 99.86%
 */
public class CombinationSum {
	List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
    	List<Integer> path = new ArrayList<>();
        if(candidates == null || candidates.length == 0) {
        	return res;
        }
        Arrays.sort(candidates);
        
        find(path, candidates, target, 0);
        return res;
    }
    
    // start is to avoid repetition of list, since 3,2,2 may occur
    public void find(List<Integer> path, int[] candidates, int target, int start){
    	
    	if(target < 0) {
    		return;
    	}
    	if(target == 0) {
    		res.add(new ArrayList<>(path));
    		
    		return;
    	}
    	
        for(int i = start; i < candidates.length; i++){
            if(target < candidates[i]) {
            	return;
            }
            path.add(candidates[i]);
            find(path, candidates, target - candidates[i], i);
            path.remove(path.size() - 1);
        }

    }
    
    public static void main(String[] args) {
    	CombinationSum test = new CombinationSum();
    	int[] candidates = {2,3,6,7};
    	int target = 7;
    	test.combinationSum(candidates, target);
    }
}
