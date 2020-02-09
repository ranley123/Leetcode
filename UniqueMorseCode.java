import java.util.HashSet;
import java.util.Set;
/*
 * id: 804
 * runtime: 4ms faster than 100%
 */
public class UniqueMorseCode {
	public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] MORSE = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
        StringBuilder sb = new StringBuilder();
        
        for(String word: words){
            char[] arr = word.toCharArray();
            for(int i = 0; i < arr.length; i++){
                sb.append(MORSE[arr[i] - 'a']);
            }
            set.add(sb.toString());    
            sb = new StringBuilder();
        }
        return set.size();
    }
}
