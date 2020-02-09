/**
 * 
 * @author ranley
 * @id: 1013
 * @runtime: 1ms faster than 100%
 */
public class CanThreePartsEqualSum {
	public boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        int equalSum = 0;
        int counter = 0;
        
        for (int i: A){
            sum += i;
        }
        if(sum % 3 != 0) return false;
        sum = sum / 3;
        
        for(int i: A){
            equalSum += i;
            if(equalSum == sum){
                equalSum = 0;
                counter++;
            }
        }
        return counter == 3;
    }
}
