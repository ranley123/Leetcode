/**
 * @id 104
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class MaximumDepthofBinaryTree {
	public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left) + 1, maxDepth(root.right) + 1);
    }
}
