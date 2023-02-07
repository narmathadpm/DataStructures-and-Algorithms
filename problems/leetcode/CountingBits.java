package leetcode;

public class CountingBits {
	public int[] countBits(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 0;
		if (n > 0) {
			dp[1] = 1;
			for (int i = 2; i <= n; i++) {
				dp[i] = dp[(i % 2)] + dp[(i / 2)];
			}
		}
		return dp;
	}
}
