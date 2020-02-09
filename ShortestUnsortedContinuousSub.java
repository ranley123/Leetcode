import java.util.Arrays;

/**
 * 
 * @author ranley
 * @id: 581
 * @runtime: 7ms faster than 93.4%
 */
public class ShortestUnsortedContinuousSub {
	public int findUnsortedSubarray(int[] nums) {
        int[] temp = new int[nums.length];
        for(int i = 0; i < nums.length; i++)
            temp[i] = nums[i];
        
        int l = 0;
        int r = nums.length - 1;
        Arrays.sort(temp);
        
        while(l <= r && nums[l] == temp[l]) l++;
        while(r >= l && nums[r] == temp[r]) r--;
        
        return r - l + 1;
    }
}
