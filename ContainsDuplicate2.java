import java.util.ArrayList;
/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 219
 * check if the array contains duplicate numbers and the indexs's distance is no more a given number k
 */
public class ContainsDuplicate2 {
	public boolean hasDuplicate(int[] nums, int k) {
		if(k >= nums.length) {
			for(int i = 0; i < nums.length - 1; i++) {
				for(int j = i + 1; j < nums.length; j++) {
					if(nums[i] == nums[j]) {
						return true;
					}
				}
			}
			return false;
		}
		else {
			for(int i = 0; i < nums.length - 1; i++) {
				//when occurs out of bounds exception
				if(i >= nums.length - k) {
					for(int j = i + 1; j < nums.length; j++) {
						if(nums[i] == nums[j]) {
							return true;
						}
					}
				}
				else {
					for(int j = i + 1; j <= i + k; j++) {
						if(nums[i] == nums[j]) {
							return true;
						}
					}
				}
			}
			return false;
		}
	}

	public static void main(String[] args) {
		ContainsDuplicate2 thing = new ContainsDuplicate2();
		int[] nums = {1,2,3,4,5,6,7,8,9,9};
		System.out.println(thing.hasDuplicate(nums, 3));
	}
}
