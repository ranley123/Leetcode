/**
 * @id 80
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class RemoveDuplicatesFromSortedArray2 {
	public int removeDuplicates(int[] nums) {
        if(nums.length < 3)
            return nums.length;
        int left = 2;
        for(int right = 2; right < nums.length; right++)
        {
            if(nums[right] != nums[left - 2])
                nums[left++] = nums[right];
        }
        return left;
    }
}
