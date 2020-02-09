/*
 * id: 704
 * runtime: 4ms faster than 97%
 */
public class BinarySearch {
	public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }
        
        int low = 0;
        int high = nums.length - 1;
        
        
        while(low < high){
            int middle = (low + high) / 2;
            if (nums[middle] < target) low = middle + 1;
            else if (nums[middle] > target) high = middle;
            else return middle;
        }
        
        if(low == high && nums[low] == target) return low;
        else return -1;
                    
    }
}
