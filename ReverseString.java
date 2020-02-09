/*
 * @since: July 3rd 2018
 * @order: 344
 * @level: easy
 */
public class ReverseString {
	public String inverse(String s) {
		//method 1
        /*StringBuilder sb = new StringBuilder();
        return(sb.append(s).reverse().toString());*/
        
        //method 2
        char[] ch = s.toCharArray();
        int halfLength = s.length() / 2;
        char temp;
        for (int i = 0; i < halfLength; i++) {
            temp = ch[s.length() - 1 - i];
            ch[s.length() - 1 - i] = ch[i];
            ch[i] = temp;
        }
        return new String(ch);
        
        //method 3 but too slow
       /*  int length = s.length();
        if (length <= 1) {
            return s;
        }
        String leftStr = s.substring(0, length / 2);
        String rightStr = s.substring(length / 2, length);
        return reverseString(rightStr) + reverseString(leftStr);*/
        
        //method 4  can use stack 

}
