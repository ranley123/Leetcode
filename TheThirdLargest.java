
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/*
 * @since: July 11th 2018
 * @order: 414
 * @level: easy
 * runtime: 2ms faster than 98.5%
 */
public class TheThirdLargest {
	public static int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > first){
                third = second;
                second = first;
                first = nums[i];
            }
            else if(nums[i] != first && (nums[i] > second || second == first)){
                third = second;
                second = nums[i];
            }
            else if(nums[i] != second && nums[i] != first && (nums[i] > third || third == second || third == first)){
                third = nums[i];
            }
        }
        
        if(first > second && second > third) return third;
        return first;
    }

	public static void main(String[] args) {
		int[] nums = { 2,2,3,1};
		System.out.println(thirdMax(nums));
	}
}
