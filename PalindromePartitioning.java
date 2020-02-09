import java.util.ArrayList;
import java.util.List;

/**
 * @id 131
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 97.4%
 */
public class PalindromePartitioning {
	List<List<String>> res = new ArrayList<>();
    public List<List<String>> partition(String s) {
        backtrack(new ArrayList<String>(), s, 0);
        return res;
    }
    
    private void backtrack(List<String> curlist, String s, int start){
        String curstr = s.substring(start);
        if (start == s.length()) {
            res.add(new ArrayList<>(curlist));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s, start, i)){
                curlist.add(s.substring(start, i + 1));
                backtrack(curlist, s, i + 1);
                curlist.remove(curlist.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String s, int left, int right){
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        
        return true;
    }
}
