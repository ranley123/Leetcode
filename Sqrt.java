/*
 * @since: July 4st 2018
 * @order: 69
 * runtime: 28ms faster than 95.55%
 * @level: easy
 */
public class Sqrt {
	public int mySqrt(int x) {
        if(x == 1) return 1;
        
        int low = 1; 
        int high = x;
        
        while ( low <= high ){
            int m = (low + high)/2;
            if ( m == x/m ){
                return m;
            } else if ( m < x/m ){
                low = m + 1;
            } else {
                high = m - 1;
            }
        }
        return low - 1;
    }

}
