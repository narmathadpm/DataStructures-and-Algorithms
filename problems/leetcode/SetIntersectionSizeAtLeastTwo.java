package leetcode;

import java.util.Arrays;

/*
You are given a 2D integer array intervals where intervals[i] = [starti, endi] represents all the integers from starti to endi inclusively.

A containing set is an array nums where each interval from intervals has at least two integers in nums.

For example, if intervals = [[1,3], [3,7], [8,9]], then [1,2,4,7,8,9] and [2,3,4,8,9] are containing sets.
Return the minimum possible size of a containing set.
Sort the array according to their end point in ascending order, AND if two intervals have same end, sort them according to their start
point in descending order. e.g [[1,5],[4,5],[5,9],[7,9],[9,10]] => [[4,5], [1,5], [7,9], [5,9] , [9,10]]
Greedy to get the rightmost two point

 */
public class SetIntersectionSizeAtLeastTwo {

	public int intersectionSizeTwo(int[][] intervals) {
		int result = 0;
		int n = intervals.length;
		if(n == 0)
		{
			return result;
		}
		Arrays.sort(intervals,(a,b)->( a[1]==b[1] ? b[0]-a[0] : a[1]-b[1]));
		result = result + 2;
		int left = intervals[0][1]-1;
		int right = intervals[0][1];
		for(int i = 1; i < n; i++)
		{
			int[] curr = intervals[i];
			if(left < curr[0] && right <= curr[1])
			{
				result++;
				left = right;
				right = curr[1];
			}
			else if(right > curr[1])
			{
				result = result + 2;
				left = curr[1]-1;
				right = curr[1];
			}
		}
		return result;

	}
}
