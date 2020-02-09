/*
 * input two binary numbers and get the binary result
 * level: easy
 * order: 67
 * runtime: 3ms faster than 97%
 * @since: June 30th 2018
 * 
 */
public class SumOfBinaryNumbers {
	public String addBinary(String a, String b) {
		int carry = 0;
        StringBuilder sb = new StringBuilder();
        
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0 || carry == 1; i--, j--){
            int x = i < 0? 0: a.charAt(i) - '0';
            int y = j < 0? 0: b.charAt(j) - '0';
            sb.append((x + y + carry)%2);
            carry = (x + y + carry)/2;
            
        }
        
        return sb.reverse().toString();
	}

	public static void main (String[] args) {
		SumOfBinaryNumbers one = new SumOfBinaryNumbers();
		System.out.println(one.addBinary("1010", "1011"));
	}
}
