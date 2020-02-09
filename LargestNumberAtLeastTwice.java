/**
 * 
 * @author ranley
 * @id: 747
 * @runtime: 0ms faster than 100%
 */
public class LargestNumberAtLeastTwice {
	public int dominantIndex(int[] nums) {
        if(nums.length < 2)
            return 0;
        int first = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int firstIndex = -1;
        int secIndex = -1;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= first){
                sec = first;
                secIndex = firstIndex;
                first = nums[i];
                firstIndex = i;
            }
            else if(nums[i] > sec){
                sec = nums[i];
                secIndex = i;
            }
        }
        if(first >= 2 * sec)
            return firstIndex;
        return -1;
    }
}
