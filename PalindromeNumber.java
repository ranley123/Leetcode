/**
 * id: 9
 * runtime: 73ms faster than 98.7%
 * @author ranley
 *
 */
public class PalindromeNumber {
	//Method 1: Use Stringm runtime 74ms, faster than 97%
	/*public boolean isPalindrome(int x) {
        if(x < 0) return false;
		char[] arr = (x + "").toCharArray();
        int low = 0;
        int high = arr.length - 1;
        
        while(low < high){
            if(arr[low] != arr[high]) return false;
            low++;
            high--;
        }
        return true;
    }*/
	
	// Method 2: Use arithmetic
	public boolean isPalindrome(int x) {
		if(x < 0 || (x != 0 && x % 10 == 0)) {
			return false;
		}
        
        int rev = 0;
        while (x>rev){
    	    rev = rev*10 + x%10;
    	    x = x/10;
        }
        //the length can be even or odd
        // when x == rev, while loop breaks and the rev is the half part of x. If they are equal, meaning the length is even and true
        // when x == rev / 10, meaning there is one more digit, such as 121, and the length is odd
        return (x==rev || x==rev/10);
	}
	
}
