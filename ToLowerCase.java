package leetcode;
/*
 * id: 709
 * runtime: 1ms faster than 97%
 */
public class ToLowerCase {
	public String toLowerCase(String str) {
        char[] chars = str.toCharArray();
        
        for (int i = 0; i < chars.length; i++){
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                //notice this method
                chars[i] = (char)(chars[i] - 'A' + 'a');
            }
        }
        
        return String.valueOf(chars);
    }
}
