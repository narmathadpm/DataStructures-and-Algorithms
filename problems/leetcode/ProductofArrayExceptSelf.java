package leetcode;
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
 */
public class ProductofArrayExceptSelf {

	public int[] productExceptSelf(int[] nums) {
		int[] result = new int[nums.length];
		int left = 1;
		int n = nums.length;
		result[0] =1;
		for(int i = 1; i < n ; i++)
		{
			result[i]= result[i-1]*nums[i-1];
		}


		int right = 1;
		for(int i = n-2; i >= 0; i--)
		{
			right = right * nums[i+1];
			result[i] = result[i] * right;
		}
		return result;
	}

}
