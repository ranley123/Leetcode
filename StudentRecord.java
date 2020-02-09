/*
 * @since: July 4st 2018
 * @order: 551
 * @level: easy
 */
public class StudentRecord {
	public boolean checkRecord(String s) {
		int absent = 0;
		
		for(int i = 0; i < s.length(); i++) {
			char letter = s.charAt(i);
			if(letter == 'A') {
				absent++;
			}
			if(absent > 1) {
				return false;
			}
			if(i < s.length() - 2 && letter == 'L' && s.charAt(i + 1) == 'L' && s.charAt(i + 2) == 'L') {
				return false;
			}
		}
		return true;
	}
	
	
}
