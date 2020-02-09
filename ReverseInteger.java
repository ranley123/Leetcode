/*
 * @since: July 4th 2018
 * @order: 7
 * @level: easy
 * @notice: 检查是否溢出，用Long
 * id: 7 
 * runtime: 14ms faster than 100%
 */
public class ReverseInteger {
	public int reverse(int x) {
        boolean negative = false;
        
        int temp = 0;
        int counter = -1;
        long res = 0;
        
        if (x < 0){
            negative = true;
            x = -x;
        }
        temp = x;
        
        while(temp > 0){
            temp = temp / 10;
            counter++;
        }
        temp = x;
        while(temp > 0){
            int remainder = temp % 10;
            res += remainder * Math.pow(10, counter);
            counter--;
            temp = temp / 10;
        }
        if(negative){
            res = -res;
        }
        if(res >= Integer.MAX_VALUE || res <= Integer.MIN_VALUE ){
            return 0;
        }
        return (int)res;
    }
	
	
}
