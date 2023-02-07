package leetcode;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int expectedSum = (n * (n + 1)) / 2;
		int currentSum = 0;
		for (int i = 0; i < nums.length; i++) {
			currentSum = currentSum + nums[i];
		}
		return expectedSum - currentSum;


	}
}
