package leetcode;
/*
Given an array of meeting time intervals intervals where intervals[i] = [starti, endi],
 return the minimum number of conference rooms required.


 */
/*
Time Complexity - O(NlogN)
Space Complexity -- O(N)
 */

import java.util.Arrays;

public class MeetingRoom2 {
	public int minMeetingRooms(int[][] intervals) {
		int n = intervals.length;
		int start[] = new int[n];
		int end[] = new int[n];
		for(int i = 0; i < n; i++)
		{
			start[i] = intervals[i][0];
			end[i] = intervals[i][1];
		}
		Arrays.sort(start);
		Arrays.sort(end);
		int endIndex = 0;
		int result = 0;
		for(int i =0; i < n; i++)
		{
			if(end[endIndex] > start[i])
			{
				result++;
			}
			else
			{
				endIndex++;
			}

		}
		return result;

	}
}
