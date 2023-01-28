package leetcode;

import java.util.HashMap;
import java.util.Map;

/*
Given a string s, find the length of the longest substring without repeating characters.
*/

public class LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {

		int longestSubStringLength = 0;
		int current = -1;
		Map<Character, Integer> temp = new HashMap<>();
		for(int i = 0; i < s.length(); i++)
		{
			if(temp.containsKey(s.charAt(i)))
			{
				current = Math.max(current, temp.get(s.charAt(i)));
			}
			temp.put(s.charAt(i), i);
			longestSubStringLength = Math.max(longestSubStringLength, i-current);
		}
		return longestSubStringLength;

	}

	//Method 2
	//Fixed space

	public int lengthOfLongestSubstring1(String s) {
		int result = 0;
		int start = 0;
		int[] temp = new int[127];
		for(int i = 0; i < s.length(); i++)
		{
			if(temp[s.charAt(i)] > 0)
			{
				start = Math.max(start, temp[s.charAt(i)]);
			}
			temp[s.charAt(i)] = i+1;
			result = Math.max(result, (i-start+1));
		}
		return result;
	}
}
