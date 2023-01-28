package leetcode;

public class ClimbingStairs {

	public int climbStairs(int n) {
		int first = 1;
		if( n > 1)
		{
			int second = 2;
			for(int i = 2; i < n; i++)
			{
				int temp = first + second;
				first = second;
				second = temp;
			}
			return second;

		}
		return first;
	}
}
