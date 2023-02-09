package leetcode;

public class SquaresofaSortedArray {
	public int[] sortedSquares(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int result[] = new int[nums.length];
		int j = right;
		while (left <= right) {
			if (Math.abs(nums[left]) > Math.abs(nums[right])) {
				result[j] = nums[left] * nums[left];
				left++;
			} else {
				result[j] = nums[right] * nums[right];
				right--;
			}
			j--;
		}
		return result;

	}
}
