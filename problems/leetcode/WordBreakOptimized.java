package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreakOptimized {
	boolean[] memo;

	public boolean wordBreak(String s, List<String> wordDict) {
		memo = new boolean[s.length() + 1];
		Set<String> temp = new HashSet<>(wordDict);
		memo[0] = true;
		int n = s.length();
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (temp.contains(s.substring(j, i)) && memo[j]) {
					memo[i] = true;
				}
			}
		}
		return memo[n];

	}
}
