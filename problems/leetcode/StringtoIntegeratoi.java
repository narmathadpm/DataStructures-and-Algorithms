package leetcode;

public class StringtoIntegeratoi {
	public int myAtoi(String s) {
		s = s.trim();
		if (s.length() == 0) {
			return 0;
		}
		long result = 0;
		int i = 0;
		int sign = 1;
		if (s.charAt(i) == '-' || s.charAt(i) == '+') {
			if (s.charAt(i) == '-')
				sign = sign * -1;
			i++;
		}
		while (i < s.length()) {
			if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				result = result * 10 + (s.charAt(i) - '0');
			} else {
				break;
			}
			if (sign * result >= Integer.MAX_VALUE) {
				return Integer.MAX_VALUE;

			} else if (sign * result <= Integer.MIN_VALUE) {
				return Integer.MIN_VALUE;

			}
			i++;
		}
		return (int) result * sign;
	}
}
