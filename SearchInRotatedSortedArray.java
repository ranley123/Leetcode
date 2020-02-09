/**
 * @id 33
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SearchInRotatedSortedArray {
	public int search(int[] nums, int target) {
        int len = nums.length;
        if(len <= 0)
            return -1;
        if(len == 1){
            return nums[0] == target? 0:-1;
        }
        int smallest = 0;
        
        // find smallest begins
        for(int i = 1; i < len; i++){
            if(nums[i] < nums[i-1]){
                smallest = i;
                break;
            }
        }

        // binary search
        int left = smallest;
        int right = left == 0? len - 1 : smallest - 1 + len;
        
        while(left != right){
            int mid = ((left + right)/2) % len;
            if(mid == left%len){
                if(nums[mid] != target && nums[right%len] != target)
                    break;
                else{
                    return nums[mid] == target? mid : right%len;
                }
            }
            
            if(nums[mid] > target)
                right = mid <= smallest? mid + len: mid;
            else if(nums[mid] < target)
                left = mid <= smallest? mid + len : mid;
            else
                return mid;
        }
        return -1;
    }
}
