/**
 * @id 129
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SumRootToLeafNumbers {
	int sum = 0;
    public int sumNumbers(TreeNode root) {
        recur(root, 0);
        return sum;
    }
    
    private void recur(TreeNode cur, int cursum){
        if(cur == null)
            return;
        if(cur.left == null && cur.right == null){
            cursum = cursum * 10 + cur.val;
            sum += cursum;
            return;
        }
        cursum = cursum * 10 + cur.val;
        recur(cur.left, cursum);
        recur(cur.right, cursum);
    }
}
