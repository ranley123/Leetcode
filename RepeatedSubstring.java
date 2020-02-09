/*
 * id: 459
 * runtime: 8ms faster than 99.5%
 */
public class RepeatedSubstring {
	public static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        //since when the length is over a half, there should be no pattern
        for (int i = 1; i <= len / 2; i++) {
            if (len % i != 0) continue;
            String pattern = s.substring(0, i);
            // Two pointer, fixed-size window.
            int offset = i;
            int j = i + offset;
            while (j <= len) {
                if (!s.substring(i, j).equals(pattern)) break;
                i += offset;
                j += offset;
            }
            if (i == len) return true;
        }
        return false;
    }
	
	 public static void main(String[] args) {
		 System.out.println(repeatedSubstringPattern("abcdabcd"));
	 }
}
