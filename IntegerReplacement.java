
public class IntegerReplacement {
    // method 1: dynamic programming
    // public int integerReplacement(int n) {
    //     int[] dp = new int[n + 2];
    //     dp[0] = dp[1] = 0;
    //     dp[2] = 1;
    //     for(int i = 4; i < n + 2; i += 2){
    //         dp[i] = dp[i / 2] + 1;
    //         dp[i - 1] = Math.min(dp[i - 2], dp[i]) + 1;
    //     }
    //     return dp[n];
    // }
    
    // method 2: recursive
    // public int integerReplacement(int n) {
    //     if(n == 1)
    //         return 0;
    //     if(n == Integer.MAX_VALUE)
    //         return 32;
    //     if(n % 2 == 0)
    //         return 1 + integerReplacement(n / 2);
    //     else
    //         return 1 + Math.min(integerReplacement(n - 1), integerReplacement(n + 1));
    // }
	
	// method 3
    public int integerReplacement(int n) {
        int res = 0;
        while (n != 1) {
            if ((n & 1) == 0) {
                n >>>= 1;
            } else if (n == 3 || ((n >>> 1) & 1) == 0) {
                n--;
            } else {
                n++;
            }
            res++;
        }
        return res;
    }
}
