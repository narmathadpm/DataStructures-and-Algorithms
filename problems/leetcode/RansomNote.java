package leetcode;

public class RansomNote {
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] temp = new int[26];
		for(char c : magazine.toCharArray())
		{
			temp[c-'a']++;
		}
		for(char c : ransomNote.toCharArray())
		{
			if(temp[c-'a'] == 0)
			{
				return false;
			}
			temp[c-'a']--;
		}
		return true;
	}
}
