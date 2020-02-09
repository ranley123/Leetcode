import java.util.List;

/**
 * @id 139
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class WordBreak {
	// dynamic programming. 4ms faster than 77.3%
//	public boolean wordBreak(String s, List<String> wordDict) {
//        int len = s.length();
//        boolean[] dp = new boolean[len + 1];
//        dp[0] = true;
//        
//        for(int i = 0; i < len + 1; i++){
//            for(int j = 0; j < i; j++){
//                if(dp[j] && wordDict.contains(s.substring(j, i))){
//                    dp[i] = true;
//                    break;
//                }
//            }
//        }
//        return dp[len];
//    }
	public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length()];
        return helper(s, wordDict, 0, dp) == 1 ? true : false;
    }
    
    private int helper(String s, List<String> wordDict, int start, int[] dp){
        if(start >= s.length())
            return 1;
        if (dp[start] != 0 ) return dp[start];
        for(int i = 0; i < wordDict.size(); i++){
            if (!s.startsWith(wordDict.get(i), start)) continue;
            if(helper(s, wordDict, start + wordDict.get(i).length(), dp) == 1){
                dp[start] = 1;
                return dp[start];
            }
        }
        dp[start] = -1;
        return -1;
    }
}
