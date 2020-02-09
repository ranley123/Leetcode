/**
 * leetcode 383
 * @author ranley
 * runtime: 7ms faster than 95.7%
 */
public class Ransom {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] ransom = new int[26];
        char[] letters = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();
        
        for(char c: magazines) ransom[(int) c - 'a']++;
        for(char c: letters) ransom[(int) c - 'a']--;
        
        for(int i = 0; i < ransom.length; i++){
            if(ransom[i] < 0){
                return false;
            }
        }
        return true;
	}
}
