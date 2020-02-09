import java.util.ArrayList;
import java.util.List;

/**
 * @id 113
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class PathSum2 {
	List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        backtrack(new ArrayList<Integer>(), root, sum);
        return res;
    }
    
    private void backtrack(List<Integer> curlist, TreeNode cur, int target){
        if(cur == null)
            return;
        if(target == cur.val && cur.left == null && cur.right == null){
            curlist.add(target);
            res.add(new ArrayList<Integer>(curlist));
            curlist.remove(curlist.size() - 1);
            return;
        }
        
        curlist.add(cur.val);
        backtrack(curlist, cur.left, target - cur.val);
        backtrack(curlist, cur.right, target - cur.val);
        curlist.remove(curlist.size() - 1);
    }
}
