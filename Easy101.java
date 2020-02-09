public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }
    
    private boolean helper(TreeNode p, TreeNode q){
        if (p == null && q == null){
            return true;
        }
        else if (p == null || q == null){
            return false;
        }
        if (q.val != p.val)
            return false;
        return helper(p.right, q.left) && helper(p.left, q.right);
    }