/**
 * id: 633
 * runtime: 5ms faster than 99.9%
 * @author ranley
 *
 */
public class SumOfSquareNumbers {
	public boolean judgeSquareSum(int c) {
        int temp = c;
        int high = (int) Math.sqrt(temp);
        int low = 0;
        
        while(low <= high){
            int res = low * low + high * high;
            if(res > c){
                high--;
            }
            else if (res == c) return true;
            else low++;
        }
        return false;      
    }
}
