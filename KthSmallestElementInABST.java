import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @id 230
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class KthSmallestElementInABST {
	// method 1: using stack
//    Stack<TreeNode> stack = new Stack<>();
//    public int kthSmallest(TreeNode root, int k) {
//        return helper(root, k, 0);
//    }
//    
//    private int helper(TreeNode cur, int k, int curk){ 
//        if(cur == null){
//            TreeNode temp = stack.pop();
//            curk++;
//            if(curk == k)
//                return temp.val;
//            return helper(temp.right, k, curk);
//        }
//        
//        stack.push(cur);
//        return helper(cur.left, k, curk);
//    }
	
	// method 2: using ArrayList and Inorder Traversal to store
//	List<Integer> res = new ArrayList<>();
//    public int kthSmallest(TreeNode root, int k) {
//        inorderTraversal(root);
//        return res.get(k - 1);
//    }
//    
//    private void inorderTraversal(TreeNode cur){
//        if(cur == null)
//            return;
//        inorderTraversal(cur.left);
//        res.add(cur.val);
//        inorderTraversal(cur.right);
//    }
	
	// method 3: dfs
	int curk = 0;
    public int kthSmallest(TreeNode root, int k) {
        return dfs(root, k);
    }
    
    private Integer dfs(TreeNode cur, int k){
        if(cur.left != null){
            Integer res = dfs(cur.left, k);
            if(res != null)
                return res;
        }
        if(curk == k - 1)
            return cur.val;
        curk++;
        if(cur.right != null)
            return dfs(cur.right, k);
        return null;
    }
}
