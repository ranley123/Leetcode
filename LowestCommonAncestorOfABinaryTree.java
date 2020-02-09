/**
 * @id 236
 * @author ranley
 * @level middle
 * @runtime 5ms faster than 100%
 */
public class LowestCommonAncestorOfABinaryTree {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || root == p || root == q)
            return root;
        TreeNode leftRes = lowestCommonAncestor(root.left, p, q);
        TreeNode rightRes = lowestCommonAncestor(root.right, p, q);
        if(leftRes != null && rightRes != null)
            return root;
        return leftRes == null ? rightRes : leftRes;
    }
}
