import java.util.HashSet;
import java.util.Set;

/*
 * @since: July 13th 2018
 * @order: 859
 * @level: easy
 * runtime: 5ms, faster than 80.45%;
 */
public class BuddyStrings {
	public static boolean isBuddy(String A, String B) {
	if (A.length() != B.length()) return false;
        char oneA = '0';
        char oneB = '0';
        char two = '0';
        
        if (A.equals(B)) {
            int[] count = new int[26];
            for (int i = 0; i < A.length(); ++i)
                count[A.charAt(i) - 'a']++;

            for (int c: count)
                if (c > 1) return true;
            return false;
        }
        
        for (int i = 0; i < A.length(); i++){
            char a = A.charAt(i);
            char b = B.charAt(i);
            if ( a!=b ){
                if (oneA == '0'){
                    oneA = a;
                    oneB = b;
                }
                else if (two == '0' && oneA == b && oneB == a){
                    two = a;
                }
                else return false;
            }
        }
        return true;
	}
	
}
