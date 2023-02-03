package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		result.add(new ArrayList<>());
		backtrack(nums, new ArrayList<>(), 0, nums.length);
		return result;
	}

	public void backtrack(int[] nums, List<Integer> current, int start, int n) {
		for (int i = start; i < n; i++) {
			current.add(nums[i]);
			result.add(new ArrayList<>(current));
			backtrack(nums, current, i + 1, n);
			current.remove(current.size() - 1);
		}
	}
}
