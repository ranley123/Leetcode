/**
 * @id 136
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SingleNumber {
	public int singleNumber(int[] nums) {
        int temp = 0;
        for(int num: nums){
            temp ^= num;
        }
        return temp;
    }
	
	// method 2: brute force
    // public int singleNumber(int[] nums) {
    //     if(nums.length <= 1)
    //         return nums[0];
    //     Arrays.sort(nums);
    //     int counter = 1;
    //     int cur = nums[0];
    //     for(int i = 1; i < nums.length; i++){
    //         if(nums[i] == cur && counter == 1){
    //             counter--;
    //         }
    //         else if(nums[i] != cur && counter == 0){
    //             cur = nums[i];
    //             counter++;
    //         }
    //         else return cur;
    //     }
    //     return cur;
    // }
}
