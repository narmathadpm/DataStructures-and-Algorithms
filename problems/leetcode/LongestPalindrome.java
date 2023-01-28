package leetcode;

public class LongestPalindrome {
	public int longestPalindrome(String s) {
		int[] lowestLettercount = new int[52];
		for(char c : s.toCharArray())
		{
			if(c >= 'A' && c <= 'Z')
				lowestLettercount[c-'A']++;
			else
				lowestLettercount[c-'a'+26]++;
		}

		int result = 0;
		boolean odd = false;
		for(int i = 0; i < 52; i++)
		{
			if(lowestLettercount[i] % 2 == 0)
				result += lowestLettercount[i];
			else if(lowestLettercount[i] % 2 == 1)
			{
				result += lowestLettercount[i] -1;
				odd = true;
			}

		}
		return odd ? result+1 : result;
	}
}
