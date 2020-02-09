import java.util.Arrays;

public class RoseGarden {
	static int minDaysBloom(int[] a, int k, int n) {
		int len = a.length;
		int[] dp = new int[len];
		dp[0] = Math.max(a[0], a[1]);

		for(int i = 1; i < len - 1; i++) {
			dp[i] = Math.min(Math.max(a[i - 1], a[i]), Math.max(a[i], a[i + 1]));
		}
		dp[len - 1] = Math.max(a[len - 1], a[len - 2]);
		
		Arrays.sort(dp);
		int res = 0;
		int curn = 0;
		int i = 0;
		while(i < len - k) {
			if(curn == n)
				return res;
			if(isSame(dp, i, i + k - 1)) {
				res = Math.max(res, dp[i]);
				curn--;
				i += k;
			}
			else
				i++;
		}
		return res;
	}
	
	static boolean isSame(int[] dp, int i, int j) {
		return dp[i] == dp[j];
	}
	
	public static void main(String[] args) {
		int[] a = {1, 2, 4, 9, 3, 4, 1};
		int k = 2;
		int n = 3;
		System.out.println(minDaysBloom(a, k, n));
	}
}
