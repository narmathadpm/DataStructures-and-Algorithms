package leetcode;

import java.util.Stack;

public class BasicCalculator {
	public int calculate(String s) {
		if (s.length() == 0) {
			return 0;
		}
		int result = 0;
		int sign = 1;
		int current = 0;
		Stack<Integer> temp = new Stack<>();
		for (int i = 0; i < s.length(); i++) {
			if (Character.isDigit(s.charAt(i))) {
				current = current * 10 + (int) (s.charAt(i) - '0');
			} else if (s.charAt(i) == '(') {
				temp.push(result);
				temp.push(sign);
				result = 0;
				sign = 1;
				current = 0;
			} else if (s.charAt(i) == '+') {
				result = result + (sign * current);
				current = 0;
				sign = 1;
			} else if (s.charAt(i) == '-') {
				result = result + (sign * current);
				current = 0;
				sign = -1;
			} else if (s.charAt(i) == ')') {
				result = result + (sign * current);
				current = 0;
				result = result * temp.pop();
				result = result + temp.pop();
			}
		}

		result = result + (current * sign);
		return result;

	}
}
