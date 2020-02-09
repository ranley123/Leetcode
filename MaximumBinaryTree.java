/**
 * @id 654
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 99.62%
 */
public class MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }
    
    private TreeNode helper(int[] nums, int start, int end){
        if(start > end)
            return null;
        int max = Integer.MIN_VALUE;
        int index = -1;
        for(int i = start; i < end + 1; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        TreeNode res = new TreeNode(max);
        res.left = helper(nums, start, index - 1);
        res.right = helper(nums, index + 1, end);
        return res;
    }
}
