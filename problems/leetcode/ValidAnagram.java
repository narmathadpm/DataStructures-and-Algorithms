package leetcode;
/*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.


 */
public class ValidAnagram {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length())
		{
			return false;
		}
		int[] temp = new int[26];
		for(char c : s.toCharArray())
		{
			temp[c-'a']++;
		}
		for(char c : t.toCharArray())
		{
			if(temp[c-'a'] == 0)
			{
				return false;
			}
			else{
				temp[c-'a']--;
			}
		}
		return true;
	}
}
