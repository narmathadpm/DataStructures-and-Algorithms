package leetcode;

import java.util.HashMap;
import java.util.Map;

public class MinumWindowSubstring {
	public String minWindow(String s, String t) {
		int n = s.length();
		int n1 = t.length();

		if (n1 > n) {
			return "";
		}
		Map<Character, Integer> temp = new HashMap<>();
		for (int i = 0; i < t.length(); i++) {
			temp.put(t.charAt(i), temp.getOrDefault(t.charAt(i), 0) + 1);
		}
		Map<Character, Integer> temp1 = new HashMap<>();
		int need = temp.size();
		int have = 0;
		int left = 0;
		int start = -1;
		int end = -1;
		int result = Integer.MAX_VALUE;
		for (int i = 0; i < s.length(); i++) {

			temp1.put(s.charAt(i), temp1.getOrDefault(s.charAt(i), 0) + 1);
			char c = s.charAt(i);
			if (temp.containsKey(c) && temp1.get(c).intValue() == temp.get(c).intValue()) {

				have++;
				System.out.println("23");
			}
			while (have == need) {
				System.out.println("23");
				if (result > (i - left + 1)) {
					result = i - left + 1;
					start = left;
					end = i;
				}

				int curr = temp1.get(s.charAt(left));
				temp1.put(s.charAt(left), curr - 1);

				if (temp.containsKey(s.charAt(left)) && temp1.get(s.charAt(left)) < temp.get(s.charAt(left))) {
					have--;
				}
				left++;
			}

		}
		System.out.println(need);
		System.out.println(have);
		System.out.println(temp1);
		System.out.println(temp);
		if (start > -1 && end > -1)
			return s.substring(start, end + 1);
		else
			return "";

	}
}
