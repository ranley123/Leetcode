/*
 * id: 686
 * runtime: 84ms, faster than 88.04%
 */
public class RepeatedString {
	public int repeatedStringMatch(String A, String B) {
        for(int i = 0; i < A.length(); i++){
            if(A.charAt(i) == B.charAt(0)){
                int start = i;
                int counter = 1;
                int j = 0;
            
                while(j < B.length() && A.charAt(start) == B.charAt(j)){
                    j++;
                    start++;
                
                    if(start >= A.length() && j < B.length()){
                        start = start % A.length();
                        counter++;
                    }
                }
                if(j == B.length()) return counter;
            }
        }
        return -1;
    }
}
