package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
	Set<List<Integer>> result = new HashSet<>();
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		backtrack(candidates,target,new ArrayList<>(), 0, 0);
		return new ArrayList<>(result);
	}

	public void backtrack(int[] candidates, int target, List<Integer> list, int total, int start)
	{

		for(int i = start; i < candidates.length; i++)
		{
			list.add(candidates[i]);
			total = total + candidates[i];
			if(total == target)
			{
				List<Integer> u =  new ArrayList<>(list);
				result.add(u);
			}
			if(total < target)
			{
				backtrack(candidates, target, list, total, i);
			}
			list.remove(list.size()-1);
			total = total - candidates[i];
		}
	}
}
