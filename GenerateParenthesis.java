import java.util.ArrayList;
import java.util.List;
/**
 * @id 22
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class GenerateParenthesis {
	List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        helper("(", n - 1, n);
        return res;
    }
    
    private void helper(String cur, int open, int close){
        if(open == close && open == 0){
            res.add(cur);
            return;
        }
        if(open > close)
            return;
        if(open < 0 || close < 0)
            return;
        
        helper(cur + "(", open - 1, close);
        helper(cur + ")", open, close - 1);
    }
}
