/**
 * @id 516
 * @author ranley
 * @level middle
 * @runtime 20ms faster than 84%
 */
public class LongestPalindromeSubsequence {
	public int longestPalindromeSubseq(String s) {
		int len = s.length();
		char[] arr = s.toCharArray();
		int[][] dp = new int[len][len];
		for(int i = len - 1; i >= 0; i--){
			for(int j = i; j < len; j++){
				if(i == j)
					dp[i][j] = 1;
				else if(arr[i] == arr[j])
					dp[i][j] = dp[i + 1][j - 1] + 2;
				else
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
			}
		}
		return dp[0][len - 1];
	}
}
