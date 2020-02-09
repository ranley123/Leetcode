/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 434
 * how many words and characters in a string
 */
public class CountWords {
	public int countSegments(String s) {
		s = s.trim();
		if(s.isEmpty()) {
			return 0;
		}
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == ' ' && s.charAt(i + 1) == ' ' && i < s.length()-1) {
				s = s.substring(0, i) + s.substring(i + 1);
				//otherwise it will ignore one
				i--;
			}
		}
		String[] things = s.split(" ");
		for(String thing: things) {
			System.out.println(thing);
		}
		return things.length;
	}
	
	public static void main(String[] args) {
		CountWords thing = new CountWords();
		int number = thing.countSegments(", , , ,        a, eaefa");
		System.out.println(number);
	}

}
