import java.util.Arrays;

/**
 * @id 215
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class KthLargestElementInAnArray {
//	public int findKthLargest(int[] nums, int k) {
//        Arrays.sort(nums);
//        return nums[nums.length - k];
//    }
	
    // public int findKthLargest(int[] nums, int k) {
    //     PriorityQueue<Integer> queue = new PriorityQueue<>();
    //     for(int num: nums){
    //         queue.offer(num);
    //         if(queue.size() > k)
    //             queue.poll();
    //     }
    //     return queue.peek();
    // }
	
	public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, k);
    }
    
    private int quickSelect(int[] nums, int start, int end, int k){
        if(start == end)
            return nums[start];
        int mid = (start + end) / 2;
        int pivot = nums[mid];
        
        int left = start;
        int right = end;
        while (left <= right) {
            while (left <= right && nums[left] > pivot)
                left++;
            while (left <= right && nums[right] < pivot)
                right--;
            if (left <= right) {
                int tmp = nums[left];
                nums[left] = nums[right];
                nums[right] = tmp;
                left++;
                right--;
            }
        }
        if (left - start >= k) {
            return quickSelect(nums, start, left - 1, k);
        } else {
            return quickSelect(nums, left, end, k - (left - start));
        }
    }
}
