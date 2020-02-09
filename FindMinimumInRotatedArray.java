/**
 * @id 153
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class FindMinimumInRotatedArray {
	public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        while(left < right){
            int mid = (left + right) / 2;
            if(mid == left)
                return Math.min(nums[left], nums[right]);
            if(nums[left] < nums[mid] && nums[mid] < nums[right]){ // the normal range
                right = mid;
            }
            else{
                if(nums[mid] < nums[right])
                    right = mid;
                else
                    left = mid;
            }
        }
        return nums[left];
    }
}
