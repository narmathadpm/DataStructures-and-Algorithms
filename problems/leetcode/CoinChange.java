package leetcode;

public class CoinChange {
	public int coinChange(int[] coins, int amount) {
		int[] dp = new int[amount+1];
		for(int i = 0; i <= amount; i++)
		{
			dp[i] = amount+1;
		}
		dp[0] = 0;
		for(int i = 1; i <= amount; i++)
		{
			for(int j = 0; j < coins.length; j++)
			{
				if(i-coins[j] >= 0)
				{
					dp[i] = Math.min(dp[i], 1+dp[i-coins[j]]);
				}
			}
			System.out.println(dp[i]);
		}
		return dp[amount] > amount ? -1 : dp[amount];

	}
}
