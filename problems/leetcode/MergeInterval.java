package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeInterval {
	public int[][] merge(int[][] intervals) {
		List<int[]> result = new ArrayList<>();
		Arrays.sort(intervals,(a, b) -> Integer.compare(a[0],b[0]));
		int end = 0;
		int start = 0;
		int i = 1;
		int n = intervals.length;
		while(i < n)
		{
			if(intervals[i][0] <= intervals[end][1])
			{
				if(intervals[i][1] >= intervals[end][1])
					end = i;
			}
			else{
				result.add(new int[]{intervals[start][0], intervals[end][1]});
				start = i;
				end = i;
			}
			i++;
		}
		result.add(new int[]{intervals[start][0], intervals[end][1]});
		return result.toArray(new int[0][]);
	}
}
