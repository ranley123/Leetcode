/*
 * id: 242
 * runtime:3ms faster than 98%
 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
        //method 1 the common way and runtime 6 ms faster than 78%
       /*
        if(s.length() != t.length()) return false;
        
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        return Arrays.equals(a, b);
        */
        
        //method 2
        if(s.length() != t.length()) return false;
        int[] letters = new int[26];
        
        for(char ch: s.toCharArray()){
            letters[ch - 'a']++;
        }
        
        for(char ch: t.toCharArray()){
            if(letters[ch - 'a'] > 0){
                letters[ch - 'a']--;
            }
            else return false;
        }
        return true;
        
    }
}
