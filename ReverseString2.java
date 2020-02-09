/*
 * id:541
 * runtime: 2ms faster than 100% 
 */
public class ReverseString2 {
	public static String reverseStr(String s, int k) {
		int len = s.length();
		char[] c = s.toCharArray();
		int index = 0;

		while ((len - index) >= 2 * k) {
			inverse(c, index, index + k);
			index += 2 * k;
		}
		if ((len - index) < k) {
			inverse(c, index, len);
			return String.valueOf(c);
		}
		if ((len - index) >= k && (len - index) < 2 * k) {
			inverse(c, index, index + k);
			return String.valueOf(c);
		}
			
		return String.valueOf(c);
	}

	public static void inverse(char[] c, int lower, int high) {
		high -= 1;
		while(lower < high) {
			char temp = c[lower];
			c[lower] = c[high];
			c[high] = temp;
			lower++;
			high--;
		}
	}

	public static void main(String[] args) {
		System.out.println(reverseStr("abcdefg", 2));
	}
}
