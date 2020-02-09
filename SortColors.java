/**
 * @id 75
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 7.37%
 */
public class SortColors {
	public void sortColors(int[] nums) {
		int len = nums.length;
		if(len < 2){
			return;
		}

		for(int i = 0; i < len; i++){
			int min = nums[i];
			for(int j = i + 1; j < len; j++){
				if(i > 0 && nums[i] == nums[i - 1]){
					break;
				}
				if(nums[j] < min){
					min = nums[j];
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		// Arrays.sort(nums);

	}
}
