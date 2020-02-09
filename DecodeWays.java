/**
 * @id 91
 * @author ranley
 * @level middle
 * @runtime 1ms faster than 98.6%
 */
public class DecodeWays {
	public int numDecodings(String s) {
        char[] arr = s.toCharArray();
        int len = arr.length;
        int[] dp = new int[len + 1];
        
        dp[0] = 1; // the one-digit decoding
        dp[1] = arr[0] == '0' ? 0 : 1;
        for(int i = 2; i < len + 1; i++){
            String two = "" + arr[i - 2];
            two = two + "" + arr[i - 1];
            if(two.compareTo("10") >= 0 && two.compareTo("26") <= 0)
                dp[i] = dp[i - 2];
            if(arr[i - 1] >= '1' && arr[i - 1] <= '9')
                dp[i] += dp[i - 1];
        }
        return dp[len];
    }
}
