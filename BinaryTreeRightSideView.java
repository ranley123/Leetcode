import java.util.ArrayList;
import java.util.List;

/**
 * @id 199
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 98.6%
 */
public class BinaryTreeRightSideView {
	List<Integer> res = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        helper(root, 1);
        return res;
    }  
    
    private void helper(TreeNode cur, int depth){
        if(cur == null)
            return;
        if(res.size() >= depth){
            res.set(depth - 1, cur.val);
        }
        else{
            res.add(cur.val);
        }
        helper(cur.left, depth + 1);
        helper(cur.right, depth + 1);
        
    }
}
