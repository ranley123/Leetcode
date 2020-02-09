/*
 * id:680
 * runtime: 19ms faster than 91%
 */
public class ValidPalindrome2 {
	public static boolean validPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        
         while(l < r){
            if(s.charAt(l) != s.charAt(r)){
                if(isPalindrome(s, l+1, r) || isPalindrome(s, l, r-1)) return true;
                return false;
            }
            
            l++; r--;
        }
        return true;
        
    }
    
    public static boolean isPalindrome(String s, int l, int r) {
        while(l < r){
            if(l < r && s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
	    
	    public static void main(String[] args) {
	    	System.out.println(validPalindrome("abc"));
	    }
}
