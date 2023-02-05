package leetcode;

public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		int zeroCount = 0;
		int j = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zeroCount++;
			} else {
				nums[j] = nums[i];
				j++;
			}
		}
		while (zeroCount > 0) {
			nums[j] = 0;
			j++;
			zeroCount--;
		}
	}
}
