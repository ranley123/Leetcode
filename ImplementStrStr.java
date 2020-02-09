/*
 * id: 28
 * runtime: 6ms faster than 84%
 */
public class ImplementStrStr {
	public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length())
			return -1;
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i <= haystack.length() - needle.length(); i++) {
			if (haystack.substring(i, i + needle.length()).equals(needle))
				return i;
		}
 
		return -1;
        
        /*
        if(haystack == null || needle == null) {
            return -1;
        }
        
        if(haystack.length() == 0 && needle.length() == 0) {
            return 0;
        }
        
        return haystack.indexOf(needle);
        */
    }
}
