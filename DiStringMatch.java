/*#
 * id:  942
 * runtime: 5ms faster than 99.6%
 */
public class DiStringMatch {
	public int[] diStringMatch(String S) {
        int len = S.length() + 1;
        int[] res = new int[len];
        char[] arr = S.toCharArray();
        int low = 0;
        int high = len - 1;
            
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 'I'){
                res[i] = low++;
            }
            else{
                res[i] = high--;
            }
        }
        res[len - 1] = low;
        return res;
        
    }
}
