/*
https://leetcode.com/problems/evaluate-reverse-polish-notation/

Evaluate the value of an arithmetic expression in Reverse Polish Notation.

Valid operators are +, -, *, and /. Each operand may be an integer or another expression.

Note that division between two integers should truncate toward zero.

It is guaranteed that the given RPN expression is always valid.
That means the expression would always evaluate to a result, and there will not be any division by zero operation.

Algorithm

stack = new Stack()
for each token in tokens:
    if token is a number:
        stack.push(token)
    else (token is operator):
        number_2 = stack.pop()
        number_1 = stack.pop()
        result = apply_operator(token, number_1, number_2)
        stack.push(result)
return stack.pop()


 */

package stack;

import java.util.Scanner;
import java.util.Stack;

public class EvaluateReversePolishNotation {
        public int evalRPN(String[] tokens) {
            Stack<Integer> s=new Stack<>();
            for(int i=0;i<tokens.length;i++)
            {
                char c=tokens[i].charAt(0);
                if(tokens[i].length()==1&&(c=='+'||c=='*'||c=='/'||c=='-'))
                {
                    int a1=s.pop();
                    int a2=s.pop();
                    if(c=='+')
                    {
                        s.push(a1+a2);
                    }else if(c=='*')
                    {
                        s.push(a1*a2);
                    }else if(c=='/')
                    {
                        s.push(a2/a1);
                    }else
                    {
                        s.push(a2-a1);
                    }

                }else
                {
                    s.push(Integer.valueOf(tokens[i]));
                }
            }
            return s.pop();
        }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int noOfElements=s.nextInt();
        String[] temperatures=new String[noOfElements];
        for(int i=0;i<noOfElements;i++)
        {
            temperatures[i]=s.nextLine();
        }

        EvaluateReversePolishNotation obj=new EvaluateReversePolishNotation();
        obj.evalRPN(temperatures);
    }

}
