package leetcode;

public class PartitionEqualSubsetSumTopDown {
	Boolean[][] memo;

	public boolean canPartition(int[] nums) {

		int totalsum = 0;
		for (int i = 0; i < nums.length; i++) {
			totalsum = totalsum + nums[i];
		}
		if (totalsum % 2 == 1) {
			return false;
		}
		int n = nums.length;
		memo = new Boolean[n + 1][totalsum / 2 + 1];
		return backtrack(nums, totalsum / 2, nums.length - 1);

	}

	public boolean backtrack(int[] nums, int expected, int n) {

		if (expected == 0) {
			return true;
		}
		if (expected < 0 || n < 0) {
			return false;
		}

		if (memo[n][expected] != null)
			return memo[n][expected];

		boolean result = backtrack(nums, expected - nums[n], n - 1) || backtrack(nums, expected, n - 1);
		memo[n][expected] = result;
		return result;
	}
}
