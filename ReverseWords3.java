/*
 * id: 557
 * runtime: 3ms faster than 100%
 * 
 */
public class ReverseWords3 {
	public String reverseWords(String s) {
	       if(s==null || s.length()==0) return s;

	        int len = s.length();
	        char[] arr = s.toCharArray();
	        int start = 0, index = s.indexOf(" "), stop = index-1;
	        while(index != -1 && start<len && stop <len) {
	            reverse(arr, start, stop);
	            index = s.indexOf(" ", index+1);
	            start = stop +2;
	            stop = index-1;
	        }
	        reverse(arr, start, len-1);

	        return String.valueOf(arr);
	            
	    }
	    
	    private void reverse(char[] arr, int start, int stop) {
	        int i=start, j=stop;
	        while(i<j) {
	            char temp = arr[i];
	            arr[i] = arr[j];
	            arr[j] = temp;
	            i++;
	            j--;
	        }
	    }
}
