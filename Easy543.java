/**
 * @id 543
 * @author ranley
 * @level easy
 * @runtime 0ms faster than 100%
 */
int res = 1;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        depth(root);
        return res - 1;
    }
    
    private int depth(TreeNode node){
        if (node == null)
            return 0;
        int left = depth(node.left);
        int right = depth(node.right);
        res = Math.max(res, left + right + 1);
        
        return Math.max(left, right) + 1;
    }