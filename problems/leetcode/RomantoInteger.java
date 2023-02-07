package leetcode;

public class RomantoInteger {
	public int romanToInt(String s) {
		int result = 0;
		int n = s.length();
		int i = 0;
		while (i < n) {
			if (s.charAt(i) == 'I') {
				if (i < n - 1) {
					if (s.charAt(i + 1) == 'V') {
						result = result + 4;
						i = i + 2;
					} else if (s.charAt(i + 1) == 'X') {
						result = result + 9;
						i = i + 2;
					} else {
						result++;
						i++;
					}
				} else {
					result++;
					i++;
				}
			} else if (s.charAt(i) == 'X') {
				if (i < n - 1) {
					if (s.charAt(i + 1) == 'L') {
						result = result + 40;
						i = i + 2;
					} else if (s.charAt(i + 1) == 'C') {
						result = result + 90;
						i = i + 2;
					} else {
						result = result + 10;
						i++;
					}
				} else {
					result = result + 10;
					i++;
				}
			} else if (s.charAt(i) == 'C') {
				if (i < n - 1) {
					if (s.charAt(i + 1) == 'D') {
						result = result + 400;
						i = i + 2;
					} else if (s.charAt(i + 1) == 'M') {
						result = result + 900;
						i = i + 2;
					} else {
						result = result + 100;
						i++;
					}
				} else {
					result = result + 100;
					i++;
				}
			} else if (s.charAt(i) == 'D') {
				result = result + 500;
				i++;
			} else if (s.charAt(i) == 'M') {
				result = result + 1000;
				i++;
			} else if (s.charAt(i) == 'L') {
				result = result + 50;
				i++;
			} else if (s.charAt(i) == 'V') {
				result = result + 5;
				i++;
			}
		}
		return result;
	}
}
