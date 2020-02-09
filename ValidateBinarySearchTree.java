/**
 * @id 98
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class ValidateBinarySearchTree {
	public boolean isValidBST(TreeNode root) {
        return recur(root, null, null);
    }
    
    private boolean recur(TreeNode cur, Integer lower, Integer upper){
        if(cur == null)
            return true;
        if(lower != null && cur.val <= lower) return false;
        if(upper != null && cur.val >= upper) return false;
        return recur(cur.left, lower, cur.val) && recur(cur.right, cur.val, upper);
    }
}
