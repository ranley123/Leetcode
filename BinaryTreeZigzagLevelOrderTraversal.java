import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @id 103
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 95.24%
 */
public class BinaryTreeZigzagLevelOrderTraversal {
	List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        recur(root, 1);
        for(int i = 1; i <= res.size(); i++){
            if(i % 2 == 0)
                Collections.reverse(res.get(i - 1));
        }
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
