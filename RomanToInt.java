import java.util.HashMap;
import java.util.Map;
/**
 * leetcode 13 from roman to integers
 * @author ranley
 * runtime: 35ms faster than 99.2%
 *
 */
public class RomanToInt {
	public int romanToInt(String s) {
		int res = 0;
        char[] letters = s.toCharArray();

        for(int i = letters.length - 1; i >= 0; i--){
            char c = letters[i];
            switch(c){
                case 'I': res += res < 5 ? 1:-1; break;
                case 'V': res += 5; break;
                case 'X': res += res < 50 ? 10:-10; break;
                case 'L': res += 50; break;
                case 'C': res += res < 500 ? 100: -100; break;
                case 'D': res += 500; break;
                case 'M': res += 1000; break;
                default: break;
            }
        }
        return res;
	}
	}
	
	
	
	public static void main(String[] args) {
		RomanToInt thing = new RomanToInt();
		System.out.print(thing.romanToInt("MCMXCIV"));
	}
}
