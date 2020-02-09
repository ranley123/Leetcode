/**
 * id: 66
 * runtime: 0ms faster than 100%
 * @author ranley
 *
 */
public class PlusOne {
	public int[] plusOne(int[] digits) {
        int[] res = new int[digits.length + 1];   
        int carry = 1;
        
        for(int i = digits.length - 1; i >= 0; i--){
            digits[i] += carry;
            carry = digits[i] / 10;
            digits[i] = digits[i] % 10;
            res[i+1] = digits[i];
        }
        if(carry == 0){
            return digits;
        }
        res[0] = 1;
        return res;
    }
}
