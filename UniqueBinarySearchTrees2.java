import java.util.ArrayList;
import java.util.List;

/**
 * @id 95
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class UniqueBinarySearchTrees2 {
	// method 1: divide and conquer
	public List<TreeNode> generateTrees(int n) {
        if(n < 1)
            return new ArrayList<TreeNode>();
        return helper(1, n);
    }
    
    private List<TreeNode> helper(int start, int end){
        List<TreeNode> list = new ArrayList<>();
        if(start > end){
            list.add(null);
            return list;
        }
        if (start == end) {
            list.add(new TreeNode(start));
            return list;
        }
        for(int i = start; i <= end; i++){
            List<TreeNode> leftList = helper(start, i - 1);
            List<TreeNode> rightList = helper(i + 1, end);
            for(TreeNode left: leftList){
                for(TreeNode right: rightList){
                    TreeNode temp = new TreeNode(i);
                    temp.left = left;
                    temp.right = right;
                    list.add(temp);
                }
            }
        }
        return list;
    }
	
}
