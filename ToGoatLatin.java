/*
 * id: 824
 * runtime: 5ms faster than 98.3%
 */
public class ToGoatLatin {
	public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        String[] pieces = S.split(" ");
        int templen = 1;
        
        for (int i = 0; i < pieces.length; i++) {
            char[] arr = pieces[i].toCharArray();
            int index = templen;
            
            if(!isVowel(arr[0]) && pieces[i].length() != 1){
                pieces[i] = pieces[i].substring(1, pieces[i].length()) + String.valueOf(arr[0]);
            }
                
            sb.append(pieces[i]);
            sb.append("ma");
            for(int j = 0; j < index; j++){
                    sb.append("a");
            }
            if(i != pieces.length - 1) sb.append(" ");
            // add one because of the space
            templen++;
        }
        return sb.toString();
    }
            
    public boolean isVowel(char c){
        return  c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
