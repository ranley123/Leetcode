/**
 * 
 * @author ranley
 * @id: 485
 * @runtime: 2ms faster than 100%
 */
public class MaxConsecutiveOnes {
	public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int max = 0;
        
        for(int i: nums){
            if(i == 1) counter++;
            else {
                if(counter > max) max = counter;
                counter = 0;
            }
        }
        max = Math.max(counter, max);
        return max;
    }
}
