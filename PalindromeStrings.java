/*
 * @since: July 4st 2018
 * @order: 125
 * runtime: 5ms faster than 97.5%
 * @level: easy
 */
public class PalindromeStrings {
	public boolean isPalindrome(String s) {
		int l = 0, r = s.length() - 1;
        
        while(l < r){
            while(l < r && !alphaNumeric(s.charAt(l)))l++;
            while(l < r && !alphaNumeric(s.charAt(r)))r--;
            
            if(l < r && toLower(s.charAt(l)) != toLower(s.charAt(r)))
                return false;
            
            l++; r--;
        }
        
        return true;
    }
    
    private static char toLower(char c){
        if(c >= 'A' && c <= 'Z'){
            c = (char)(c-'A'+'a');
        }
        
        return c;
    }
    
    private static boolean alphaNumeric(char c){
        if((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9'))
            return true;
        
        return false;
    }
	
	
			
}
