/*
 * id: 387
 * runtime: 8ms faster than 98.3%
 */
public class FirstUniqueChar {
	public int firstUniqChar(String s) {
		char[] arr = s.toCharArray();
		int[] alpha = new int[26];
		for (char c : arr) {
			alpha[(int) c - 'a']++;
		}

		for (int i = 0; i < arr.length; i++) {
			if (alpha[arr[i] - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}
}
