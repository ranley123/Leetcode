/**
 * id: 27
 * runtime: 3ms faster than 100%
 * @author ranley
 *
 */
public class RemoveElements {
	public int removeElement(int[] nums, int val) {
        int index = 0;
        int counter = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                nums[i] = -1;
            }
        }
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != -1){
                int temp = nums[i];
        		nums[i] = nums[index];
        		nums[index] = temp;
        		index++;
                counter++;
            }
        }
        return counter;
    }
}
