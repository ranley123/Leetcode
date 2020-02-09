import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * @since: July 11th 2018
 * @order: 561
 * @level: easy
 * runtime: 33ms, faster than 76.55%;
 */

public class ArrayPairSum {
public static int sum(int[] nums) {
	Arrays.sort(nums);
        int result = 0;
        for (int i = 0; i < nums.length - 1; i += 2){
            result += nums[i];
        }
        return result;
}
	
}
