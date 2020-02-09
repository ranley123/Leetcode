
/**
 * leetcode 14
 * @author ranley
 * runtime: 4ms faster than 100%
 *
 */
public class LongestPrefix {
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		String result = strs[0];
        
		int i = 1;
		while (i < strs.length) {
			while(! strs[i].startsWith(result)){
                result = result.substring(0, result.length() - 1);
            }
            if(result.length() == 0) break;
            i++;
		}
		return result;
	}
}
