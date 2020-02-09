/**
 * id:283
 * runtime: 1ms faster than 100%
 * @author ranley
 *
 */
public class MovesZeros {
	public static void moveZeros(int[] nums) {
        int len = nums.length;
        int index = 0;
        for(int i = 0; i < len; i++) {
        	if(nums[i] != 0) {
        		int temp = nums[i];
        		nums[i] = nums[index];
        		nums[index] = temp;
        		index++;
        	}
        }
    }
	
	public static void main(String [] args) {
		int[] nums = {0,1,0,3,12};
		moveZeros(nums);
		for(int num: nums) {
			System.out.print(num);
		}
	}
}
