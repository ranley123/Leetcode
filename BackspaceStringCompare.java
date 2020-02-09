import java.util.Stack;

/**
 * id:844
 * runtime: 4ms faster than 98.3%
 * @author ranley
 *
 */
public class BackspaceStringCompare {
	// Method 1: This is to use stack 
	/*public boolean backspaceCompare(String S, String T) {
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        Stack<Character> stackS = new Stack<>();
        Stack<Character> stackT = new Stack<>();
        int index = 0;
        
        while(index < s.length || index < t.length){
            if(index < s.length){
                if(s[index] != '#'){
                    stackS.push(s[index]);
                }
                else if(!stackS.isEmpty()){
                    stackS.pop();
                }
            }
            if(index < t.length){
                if(t[index] != '#'){
                    stackT.push(t[index]);
                }
                else if(!stackT.isEmpty()){
                    stackT.pop();
                }
            }
            index++;
        }
        
        if(stackS.size() != stackT.size()) return false;
        while(!stackS.isEmpty()){
            if(stackS.pop()!= stackT.pop()) return false;
        }
        return true;
    }*/
	

	// Method 2: use string builder
    //runtime 4ms
    public boolean backspaceCompare(String S, String T){
        if(S.equals(T)) return true;
        
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        
        int slen = S.length();
        int tlen = T.length();
        int i = 0, j = 0;
        
        while(i < slen || j < tlen){
            if(i < slen){
                char c = s[i];
                if(c == '#'){
                    if(sb1.length() != 0) sb1.deleteCharAt(sb1.length() - 1);
                }
                else sb1.append(c);
            }
            if(j < tlen){
                char d = t[j];
                if(d == '#'){
                    if(sb2.length() != 0) sb2.deleteCharAt(sb2.length() - 1);
                }
                else sb2.append(d);
            }
            i++;
            j++;
        }      
        return sb1.toString().equals(sb2.toString());
    }
	
}
