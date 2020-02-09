import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/**
 * id: 819
 * runtime: 4ms faster than 99%
 * @author ranley
 *
 */
public class MostCommonWord {
	public String mostCommonWord(String paragraph, String[] banned) {
        paragraph += ".";

        Set<String> banset = new HashSet();
        for (String word: banned) banset.add(word);
        Map<String, Integer> map = new HashMap();
        String ans = ""; // store the returned answer
        int ansfreq = 0; // store the max occurrance
        
        StringBuilder word = new StringBuilder();
        for (char c: paragraph.toCharArray()) {
            if (Character.isLetter(c)) {
                word.append(Character.toLowerCase(c));
            } else if (word.length() > 0) {
                String finalword = word.toString();
                if (!banset.contains(finalword)) {
                    map.put(finalword, map.getOrDefault(finalword, 0) + 1);
                    if (map.get(finalword) > ansfreq) {
                        ans = finalword;
                        ansfreq = map.get(finalword);
                    }
                }
                word = new StringBuilder();
            }
        }

        return ans;
    }
	            
	    
	    
	    public static void main(String[] args) {
	    	MostCommonWord thing = new MostCommonWord();
	    	String[] banned = {"hit", "bob"};
	    	String one = thing.mostCommonWord("Bob. hIt, baLl",banned);
	    	System.out.print(one);
//	    	StringBuilder sb = new StringBuilder();
//	    	System.out.println(sb.toString().length());
	    	
	    }
}
