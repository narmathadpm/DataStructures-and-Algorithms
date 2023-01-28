package leetcode;

import java.util.Stack;

public class EvaluateReversePolishNotation {
	public int evalRPN(String[] tokens) {
		Stack<Integer> temp = new Stack<>();
		for(String s : tokens)
		{
			if(!isOperator(s))
			{
				temp.push(Integer.valueOf(s));
			}
			else{
				int number1 = temp.pop();
				int number2 = temp.pop();
				switch(s)
				{
					case "+" :
						temp.push(number1 + number2);
						break;
					case "-":
						temp.push(number2 - number1);
						break;
					case "*":
						temp.push(number2* number1);
						break;
					case "/":
						temp.push(number2/number1);
						break;
				}
			}
		}
		return temp.pop();
	}
	public boolean isOperator(String s)
	{
		return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/");
	}
}
