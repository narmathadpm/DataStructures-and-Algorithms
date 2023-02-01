package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		Map<Integer,Integer> temp = new HashMap<>();
		int max = Integer.MIN_VALUE;
		int result = 0;
		for(int i = 0 ; i < nums.length; i++)
		{
			temp.put(nums[i], temp.getOrDefault(nums[i],0)+1);
			if( max < temp.get(nums[i]))
			{
				max = temp.get(nums[i]);
				result = nums[i];
			}
		}
		return result;
	}

	public int majorityElement1(int[] nums) {
		int major = nums[0];
		int count = 1;
		for(int i = 1 ; i < nums.length; i++)
		{
			if(count == 0)
			{
				major = nums[i];
				count = 1;
			}else if(major == nums[i])
			{
				count++;
			}else
			{
				count--;
			}

		}
		return major;
	}
}
