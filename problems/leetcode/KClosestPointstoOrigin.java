package leetcode;

import java.util.Arrays;

public class KClosestPointstoOrigin {
	public int[][] kClosest(int[][] points, int k) {
		int low = 0;
		int high = points.length-1;
		while(low < high)
		{
			int mid = findMid(points, low, high);
			if(mid == k)
			{
				break;
			}
			else if(mid < k)
			{
				low = mid+1;
			}
			else{
				high = mid-1;
			}

		}
		return Arrays.copyOfRange(points, 0, k);
	}

	public int findMid(int[][] points, int low, int high)
	{
		int[] pivot = points[high];
		int i = low;
		while(low < high)
		{
			if(compare(points[low],pivot) <= 0)
			{
				int[] temp = points[i];
				points[i] = points[low];
				points[low] = temp;
				i++;
			}
			low++;
		}
		int[] temp = pivot;
		points[high] = points[i];
		points[i] = temp;

		return i;
	}

	public int compare(int[] p1, int[] p2)
	{
		return (((p1[0] * p1[0]) + (p1[1] * p1[1])) - ((p2[0] * p2[0]) + (p2[1] * p2[1])));
	}
}
