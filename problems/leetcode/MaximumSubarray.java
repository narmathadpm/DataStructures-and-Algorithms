package leetcode;
/*
Given an integer array nums, find the
subarray
 with the largest sum, and return its sum.
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int result = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < nums.length; i++)
		{
			result = Math.max(result+nums[i], nums[i]);
			max = Math.max(max, result);
		}
		return max;
	}
}
