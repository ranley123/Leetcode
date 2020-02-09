
public class TimeToTypeAString {
	static int timeToType(String keyboard, String text) {
		int time = 0;
		char[] arr = keyboard.toCharArray();
		int[] keyboard_char = new int[26];
		char[] text_char = text.toCharArray();
		int cur = 0;
		
		for(int i = 0; i < arr.length; i++) {
			keyboard_char[arr[i] - 'a'] = i;
		}
		for(int i  = 0; i < text_char.length; i++) {
			time += Math.abs(keyboard_char[text_char[i] - 'a'] - cur);
			cur = keyboard_char[text_char[i] - 'a'];
		}
	
		return time;
	}
	
	public static void main(String[] main) {
		String keyboard = "abcdefghijklmnopqrstuvwxy";
		String text = "cbaaaay";
		System.out.println(timeToType(keyboard, text));
	}
}
