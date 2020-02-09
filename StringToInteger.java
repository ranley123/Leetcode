/**
 * @id 8
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 100%
 */
public class StringToInteger {
	public int myAtoi(String str) {
        if(str.isEmpty())
            return 0;
        char[] arr = str.toCharArray();
        int sign = 1;
        int cur = 0;
        int i = 0;
        
        while(i < arr.length && arr[i] == ' '){
            i++;
        }
        
        if(i < arr.length && (arr[i] == '+' || arr[i] == '-'))
            sign = arr[i++] == '+' ? 1 : -1;
        
        while(i < arr.length && arr[i] >= '0' && arr[i] <= '9'){
            if(cur > Integer.MAX_VALUE / 10 ||(cur == Integer.MAX_VALUE / 10 && arr[i] - '0' > 7))
                return (sign == 1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
            cur = 10 * cur + (arr[i] - '0');
            i++;
        }
        return cur * sign;
    }
}
