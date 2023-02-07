package leetcode;

public class BackspaceStringCompare {
	public boolean backspaceCompare(String s, String t) {
		StringBuilder sb = new StringBuilder();
		int i = s.length() - 1;
		int count = 0;
		while (i >= 0) {
			if (count == 0 && s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				sb.append(s.charAt(i));
			} else if (s.charAt(i) == '#') {
				count++;
			} else {
				count--;
			}
			i--;
		}
		StringBuilder sb1 = new StringBuilder();
		i = t.length() - 1;
		while (i >= 0) {
			if (count == 0 && t.charAt(i) >= 'a' && t.charAt(i) <= 'z') {
				sb1.append(t.charAt(i));
			} else if (t.charAt(i) == '#') {
				count++;
			} else {
				count--;
			}
			i--;
		}
		System.out.println(sb.toString());
		System.out.println(sb1.toString());
		return sb.toString().equalsIgnoreCase(sb1.toString());
	}
}
