/**
 * 
 * @author ranley
 * @id: 26
 * @runtime: 1ms faster than 100%
 */
public class RemoveDuplicatesFromSortedArray {
// 	public int removeDuplicates(int[] nums) {
// 		if(nums == null || nums.length == 0) return 0;
// 		int lastNum = nums[0];
// 		int length = 1;
// 		for(int n : nums)
// 		    if(n != lastNum){
// 			nums[length++] = n; // do not swap
// 			lastNum = n;
// 		    }
// 		return length;
//     	}	
	public int removeDuplicates(int[] nums) {
		if(nums.length <= 1)
		    return nums.length;
		int left = 0;
		int right = 0;
		while(right < nums.length){
		    if(nums[left] == nums[right])
			right++;
		    else{
			nums[++left] = nums[right];
			right++;
		    }
		}
		return left + 1;
    	}
}
