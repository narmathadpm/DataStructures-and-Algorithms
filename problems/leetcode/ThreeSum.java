package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> temp = new HashSet<>();
		Arrays.sort(nums);
		int n = nums.length;
		for(int i = 0; i < n-2; i++)
		{
			int left = i+1;
			int right = n-1;
			while(left < right)
			{
				int sum = nums[i]+nums[left]+nums[right];
				if(sum == 0)
				{
					temp.add(Arrays.asList(nums[i],nums[left],nums[right]));
					left++;
					right--;
				}
				else if(sum > 0)
				{
					right--;
				}
				else if(sum < 0)
				{
					left++;
				}
			}
		}
		return new ArrayList<>(temp);

	}
}
