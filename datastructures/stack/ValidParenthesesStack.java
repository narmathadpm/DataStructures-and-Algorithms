/*
https://leetcode.com/problems/valid-parentheses/

Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.


We need to use stack push element when open brackets is there
need to pop when close brackets available


 */




package stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidParenthesesStack {

    public boolean isValid(String s) {

        Stack<Character> stack=new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.nextLine();
        ValidParenthesesStack obj=new ValidParenthesesStack();
        obj.isValid(s);
    }
}
