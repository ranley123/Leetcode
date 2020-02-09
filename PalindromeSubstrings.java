/**
 * @id 647
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class PalindromeSubstrings {
//	public int countSubstrings(String s) {
//        char[] arr = s.toCharArray();
//        int N = arr.length;
//        int res = 0;
//        for(int center = 0; center < 2 * N - 1; center++){
//            int left = center / 2;
//            int right = left + center % 2;
//            while (left >= 0 && right < N && arr[left] == arr[right]) {
//                res++;
//                left--;
//                right++;
//            }
//        }
//        return res;
//    }
	
	int res = 0;
    public int countSubstrings(String s) {
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            helper(arr, i, i);
            helper(arr, i, i+1);
        }
        return res;
    }
    
    private void helper(char[] arr, int i, int j){
        while(i >= 0 && j < arr.length && arr[i] == arr[j]){
            res++;
            i--;
            j++;
        }
    }
}
