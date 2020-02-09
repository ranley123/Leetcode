/**
 * 
 * @author ranley
 * @id: 521
 * @runtime: 0ms faster than 100%
 */
public class LongestUncommonSubsequence1 {
	public int findLUSlength(String a, String b) {
        return a.equals(b) ? -1 : Math.max(a.length(), b.length());
    }
}
