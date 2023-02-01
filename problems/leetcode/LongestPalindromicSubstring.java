package leetcode;

public class LongestPalindromicSubstring {
	int start1 = 0;
	int max = Integer.MIN_VALUE;

	public String longestPalindrome(String s) {
		int n = s.length();
		for(int i = 0; i < n; i++)
		{
			expand(i,i,s,n);
			expand(i,i+1,s,n);
		}

		return s.substring(start1, start1+max);

	}

	public void expand(int start, int end, String s, int n)
	{
		while(start >= 0 && end < n && s.charAt(start) == s.charAt(end))
		{
			start--;
			end++;
		}

		if(max < (end-start-1))
		{
			max = end-start-1;
			start1 = start+1;
		}


	}
}
