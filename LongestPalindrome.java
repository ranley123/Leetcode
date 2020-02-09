/**
 * @id 5
 * @author ranley
 * @runtime 12ms faster than 60.68%
 */
public class LongestPalindrome {
	public String longestPalindrome(String s) {
        if(s.length() == 0){
            return s;
        }
        int max = 0;
        int center = 0;
        int flag = 0;
        
        if(s.length() == 1)
            return s;
        for(int i = 0; i < s.length(); i++){
            int len1 = expand_around(s, i, i - 1, i + 1);
            int len2 = expand_around(s, i, i - 1, i);

            int len = Math.max(len1, len2);

            if(len > max){
                max = len;
                center = i;
                flag = len <= len2 ? 1:0;
            }
        }
        
        if(flag == 1)
            return s.substring(center - max/2, center + max/2);
        else
            return s.substring(center - max/2, center + max/2 + 1);
    }
    
    public int expand_around(String s, int center, int left, int right){
        char[] arr = s.toCharArray();
        while(left >= 0 && right < arr.length && arr[left] == arr[right]){
            left--;
            right++;
        }
        if(left < 0 && right >= arr.length){
             return arr.length;
        }
        return right - left - 1;

    }
    
    public static void main(String [] args) {
    	LongestPalindrome object = new LongestPalindrome();
    	object.longestPalindrome("bb");
    }
}
