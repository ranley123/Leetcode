import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * @id 47
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */

public class Permutations2 {
	public List<List<Integer>> permuteUnique(int[] nums) {
		// find the first decreasing element
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> permutation = new ArrayList<>();
        for(int num: nums){
            permutation.add(num);
        }
        res.add(permutation);
        addAllPermutations(res, nums);
        return res;
	}
	
	private void addAllPermutations(List<List<Integer>> res, int[] nums){
        int index = findFirstDecreasingIndex(nums);
        if(index == -1)
            return;
        int target = findFirstLargerIndex(nums, index);
        swap(nums, index, target);
        reverseArray(nums, index + 1, nums.length - 1);
        List<Integer> permutation = new ArrayList<>();
        for(int num: nums){
            permutation.add(num);
        }
        res.add(permutation);
        addAllPermutations(res, nums);
    }
    
    private int findFirstDecreasingIndex(int[] nums){
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                return i;
            }
        }
        return -1;
    }
    
    private int findFirstLargerIndex(int[] nums, int index){
        int target = nums[index];
        for(int i = nums.length - 1; i > index; i--){
            if(nums[i] > target){
                return i;
            }
        }
        return -1;
    }
    
    private void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    private void reverseArray(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
