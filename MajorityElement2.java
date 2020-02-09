import java.util.ArrayList;
import java.util.List;
/**
 * @id 229
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
		if (nums == null || nums.length == 0)
			return new ArrayList<Integer>();
		int len = nums.length;
		List<Integer> res = new ArrayList<>();

		int first = 0, first_counter = 0;
		int second = 0, second_counter = 0;

		for(int num: nums){
			if(num == first)
				first_counter++;
			else if(num == second)
				second_counter++;
			else if(first_counter == 0){
				first = num;
				first_counter = 1;
			}
			else if(second_counter == 0){
				second = num;
				second_counter = 1;
			}
			else{
				first_counter--;
				second_counter--;
			}
		}
		first_counter = 0;
		second_counter = 0;

		for(int num: nums){
			if(num == first)
				first_counter++;
			else if(num == second)
				second_counter++;
		}

		if(first_counter > (len / 3))
			res.add(first);
		if(second_counter > (len / 3))
			res.add(second);
		return res;
	}
}
