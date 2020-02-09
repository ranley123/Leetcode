/**
 * @id 31
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class NextPermutation {
	public void nextPermutation(int[] nums) {
		if(nums.length <= 1)
			return;
		boolean isAscending = true;
		// at least 2 elements in nums
		for(int i = nums.length - 2; i >= 0; i--) {
			if (nums[i] >= nums[i + 1])
				continue;
			else {
				isAscending = false;
				// find the smallest number larger than it
				for(int j = nums.length - 1; j > i; j--){
                    if(nums[j] > nums[i]){
                        // swap
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
				
				// reverse the rest part                
				nums = reverseArray(nums, i + 1, nums.length);
				break;
			}
		}
		
		// handle the existing larget number
		if(isAscending) {
			// reverse 
			nums = reverseArray(nums, 0, nums.length);
		}
	}
	
	public static int[] reverseArray(int[] nums, int start, int end) {
		int len = end - start;
        end = end - 1;
		while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
		return nums;
	}
}
