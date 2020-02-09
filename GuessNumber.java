/*
 * id:374
 * runtime: 1ms, faster than 98.6%
 */
public class GuessNumber {
	public int guessNumber(int n) {
        long low = 0;
        long high = n;
        
        while(low < high){
            long mid = (low + high)/2;
            long res = guess((int)mid);
            if (res == -1) high = mid - 1;
            else if(res == 0) return (int)mid;
            else low = mid + 1;
        }
        
        return (int)low;
    }
}
