/**
 * @id 226
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		helper(root);
		return root;
	}

	private void helper(TreeNode cur){
		if(cur == null)
			return;
		TreeNode temp = cur.right;
		cur.right = cur.left;
		cur.left = temp;
		helper(cur.left);
		helper(cur.right);
	}
}
