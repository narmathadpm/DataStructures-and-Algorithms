package leetcode;

public class SortColors {

	public void sortColors(int[] nums) {
		int redCount = 0;
		int whiteCount = 0;
		int blueCount = 0;
		for (int i = 0; i < nums.length; i++) {
			switch (nums[i]) {
				case 1:
					whiteCount++;
					break;
				case 2:
					blueCount++;
					break;
				case 0:
					redCount++;
					break;
			}
		}
		int j = 0;
		for (int i = 0; i < redCount; i++) {
			nums[j] = 0;
			j++;
		}
		for (int i = 0; i < whiteCount; i++) {
			nums[j] = 1;
			j++;
		}
		for (int i = 0; i < blueCount; i++) {
			nums[j] = 2;
			j++;
		}
	}
}
