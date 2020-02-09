/*
 * id: 917
 * runtime: 4ms faster than 99.53%
 */
public class ReverseOnlyLetter {
	public static String reverseOnlyLetters(String S) {
        int low = 0;
        int high = S.length() - 1;
        char[] arr = S.toCharArray();
        
        while(low < high){
            
            while((!isLetter(arr[low])) && low < high) low++;
            while((!isLetter(arr[high])) && low < high) high--;
                
            char temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;  
            
            low++;
            high--;
        }
        
        return String.valueOf(arr);
    }
    
    public static boolean isLetter(char letter){
        return (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z');
    }
    
    public static void main(String[] args) {
    	System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}
