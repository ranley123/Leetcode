/*
 * @since: July 1st 2018
 * @level: easy
 * @order: 520
 * check if the usage of capital is right
 */
public class DetectCapitalUse {
	public boolean detect(String word) {
		if(allCapital(word) || allLower(word) || mixed(word)) {
			return true;
		}
		else return false;
	}
	
	public boolean allCapital(String word) {
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(Character.isLowerCase(letter)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean allLower(String word) {
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(Character.isUpperCase(letter)) {
				return false;
			}
		}
		return true;
	}
	
	public boolean mixed(String word) {
		for(int i = 0; i < word.length(); i++) {
			char letter = word.charAt(i);
			if(i == 0) {
				if(Character.isLowerCase(letter)) return false;
			}
			else {
				if(Character.isUpperCase(letter)) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		DetectCapitalUse thing = new DetectCapitalUse();
		System.out.println(thing.detect("Leetcode"));;
	}
}
