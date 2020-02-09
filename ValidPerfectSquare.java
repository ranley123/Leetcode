/*
 * id: 367
 * runtime: 0ms faster than 100%
 */
public class ValidPerfectSquare {
	public boolean isPerfectSquare(int num) {
        //use long since the number can be really big, which causes overflow
        long low = 1;
        long high = num;
        
        while(low < high){
            long mid = (low + high) / 2;
            long res = mid * mid;
            if (res > num) high = mid - 1;
            else if (res < num) low = mid + 1;
            else return true;
        }
        
        return low*low == num;
                
    }
}
