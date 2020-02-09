/*
 * id: 35
 * runtime: 4ms faster than 98%
 */
public class BinaryInsert {
	public int searchInsert(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        
        while(low < high){
            int middle = (low + high)/2;
            if (nums[middle] > target) high = middle;
            //make sure that at the end the low is bigger than the original
            else if (nums[middle] < target) low = middle + 1;
            else return middle;
        }
        
        return nums[low] < target? ++low : low;
    }
}
