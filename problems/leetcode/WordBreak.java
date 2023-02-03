package leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	Boolean[] memo;

	public boolean wordBreak(String s, List<String> wordDict) {
		memo = new Boolean[s.length()];
		Set<String> temp = new HashSet<>(wordDict);
		return backtrack(temp, 0, s.length(), s);

	}

	public boolean backtrack(Set<String> temp, int start, int n, String s) {
		if (start == n) {
			return true;
		}
		if (memo[start] != null) {
			return memo[start];
		}
		for (int i = start + 1; i <= n; i++) {
			if (temp.contains(s.substring(start, i)) && backtrack(temp, i, n, s)) {
				memo[start] = true;
				return true;
			}
		}
		memo[start] = false;
		return false;
	}
}
