import java.util.ArrayList;
import java.util.List;

/**
 * @id 102
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 90%
 */
public class BinaryTreeLevelOrderTraversal {
	List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        recur(root, 1);
        return res;
    }
    
    private void recur(TreeNode curnode, int depth){
        if(curnode == null)
            return;
        if(res.size() >= depth){
            res.get(depth - 1).add(curnode.val);
        }
        else{
            List<Integer> curlist = new ArrayList<>();
            curlist.add(curnode.val);
            res.add(curlist);
        }
        recur(curnode.left, depth + 1);
        recur(curnode.right, depth + 1);
    }
}
