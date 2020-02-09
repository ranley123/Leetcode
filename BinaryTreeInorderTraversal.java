import java.util.ArrayList;
import java.util.List;

/**
 * @id 94
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class BinaryTreeInorderTraversal {
    // This is iterative way
//  public List<Integer> inorderTraversal(TreeNode root) {
//      List<Integer> res = new ArrayList<>();
//      Stack<TreeNode> stack = new Stack<>();
//      TreeNode cur = root;
//      while(cur != null || !stack.isEmpty()){
//          while(cur != null){
//              stack.push(cur);
//              cur = cur.left;
//          }
//          TreeNode temp = stack.pop();
//          res.add(temp.val);
//          cur = temp.right;
//      }
     
//      return res;
//  }
 
 public List<Integer> inorderTraversal(TreeNode root) {
     List<Integer> res = new ArrayList<>();
     TreeNode cur = root;
     recur(cur, res);
     return res;
 }
 
 private void recur(TreeNode cur, List<Integer> res){
     if(cur == null)
         return;
     recur(cur.left, res);
     res.add(cur.val);
     recur(cur.right, res);
 }
}
