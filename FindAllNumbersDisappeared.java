import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ranley
 * @id: 448
 * @runtime: 6ms faster than 96.3%
 */
public class FindAllNumbersDisappeared {
	public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = nums.length - 1;
        while(i >= 0){
            if(nums[i] != i+1 && nums[nums[i]-1] != nums[i]){
                swap(nums, i, nums[i]-1);
            }
            else {
            	i--;
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j+1)
                list.add(j+1);
        }
        return list;
    }
            
    private static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    public static void main(String [] args) {
    	int[] thing = {4,3,2,7,8,2,3,1};
    	System.out.print(findDisappearedNumbers(thing));
    }
}
