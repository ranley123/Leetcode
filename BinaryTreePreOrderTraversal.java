import java.util.ArrayList;
import java.util.List;

/**
 * @id 144
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class BinaryTreePreOrderTraversal {
    // this is iterative
//  public List<Integer> preorderTraversal(TreeNode root) {
//      List<Integer> res = new ArrayList<>();
//      Stack<TreeNode> stack = new Stack<>();
     
//      TreeNode cur = root;
//      while(cur != null || !stack.isEmpty()){
//          while(cur != null){
//              stack.push(cur);
//              res.add(cur.val);
//              cur = cur.left;
//          }
//          TreeNode temp = stack.pop();
//          cur = temp.right;
//      }
//      return res;
//  }

 public List<Integer> preorderTraversal(TreeNode root) {
     List<Integer> res = new ArrayList<>();
     recur(root, res);
     return res;
 }
 
 private void recur(TreeNode cur, List<Integer> res){
     if(cur == null)
         return;
     res.add(cur.val);
     recur(cur.left, res);
     recur(cur.right, res);
 }
}
