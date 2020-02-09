/**
 * @id: 400
 * @runtime: 0ms faster than 100%
 * @author ranley
 *
 */
public class FindNthDigit {
	public static int findNthDigit(int n) {
        if(n < 10) return n;
        int digit = 1;
        long temp = 0;
        
        while(true){
            temp = (long)(Math.pow(10, digit) - Math.pow(10, digit - 1)) * digit;
            if(temp > n)
                break;
            digit++;
            n -= temp;
        }
        
        int remain = n % digit;
        int nthNum = 0;
        if(remain == 0){
            nthNum = (int)Math.pow(10, digit - 1) + n / digit - 1;
            return (nthNum % 10);
        }
        else{
            nthNum = (int)Math.pow(10, digit - 1) + n / digit;
            String num = nthNum + "";
            return num.charAt(remain - 1) - '0';
        }
    }
	
	public static void main(String[] args) {
		System.out.println(findNthDigit(999999999));
	}
}
