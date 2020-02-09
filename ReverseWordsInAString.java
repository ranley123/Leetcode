/**
 * @id 151
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class ReverseWordsInAString {
	public String reverseWords(String s) {
        if (s == null || s.length() == 0) return ""; 

        StringBuilder sb = new StringBuilder();
        String[] words = s.split(" ");
        if (words.length == 0) return ""; // all blank
        
        for (int i = words.length - 1; i >= 0; i--) {
            if (words[i].length() == 0) continue;
            sb.append(" ");
            sb.append(words[i]);
        }
        sb.deleteCharAt(0);
        return sb.toString();
    }
}
