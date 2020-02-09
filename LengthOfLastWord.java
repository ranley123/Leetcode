/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 58
 * runtime 3ms, faster than 86%
 * return the length of the last word in a string
 */
public class LengthOfLastWord {
	public int Length(String s) {
		s = s.trim();
        if(s.isEmpty()) return 0;
            
        String[] things = s.split(" ");
        String last = things[things.length - 1];
        return last.length();
	}

}
