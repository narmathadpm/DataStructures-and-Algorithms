package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	List<List<Integer>> result = new ArrayList<>();
	public List<List<Integer>> permute(int[] nums) {
		backtrack(nums, new ArrayList<>(), new boolean[nums.length]);
		return result;

	}

	public void backtrack(int[] nums, List<Integer> temp, boolean[] visited)
	{
		if(nums.length == temp.size())
		{
			result.add(new ArrayList<>(temp));
			return;
		}
		for(int i = 0; i < nums.length; i++)
		{
			if(!visited[i])
			{
				visited[i] = true;
				temp.add(nums[i]);
				backtrack(nums, temp, visited);
				visited[i] = false;
				temp.remove(temp.size() - 1);
			}
		}
	}
}
