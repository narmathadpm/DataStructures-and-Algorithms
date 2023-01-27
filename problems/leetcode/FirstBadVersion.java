package leetcode;

public class FirstBadVersion {
	public boolean isBadVersion(int n)
	{
		return true;
	}
	public int firstBadVersion(int n) {
		int low = 1;
		int high = n;
		while(low < high)
		{
			int mid = low + (high - low) / 2;
			if(!isBadVersion(mid))
			{
				low = mid+1;
			}else{
				high = mid;
			}
		}
		return low;

	}
}
