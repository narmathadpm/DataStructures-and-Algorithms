package leetcode;

public class SortcolorOptimized {
	public void sortColors(int[] nums) {
		int current = 0;
		int n = nums.length;
		int zero = 0;
		int two = n - 1;
		while (current <= two) {
			if (nums[current] == 0) {
				int tmp = nums[zero];
				nums[zero++] = nums[current];
				nums[current++] = tmp;
			} else if (nums[current] == 2) {
				int tmp = nums[two];
				nums[two--] = nums[current];
				nums[current] = tmp;
			} else {
				current++;
			}
		}
	}
}
