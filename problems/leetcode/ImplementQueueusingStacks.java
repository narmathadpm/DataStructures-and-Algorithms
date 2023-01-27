package leetcode;

import java.util.Stack;

public class ImplementQueueusingStacks {

	Stack<Integer> s1;
	Stack<Integer> s2;

	public ImplementQueueusingStacks() {
		s1 = new Stack<>();
		s2 = new Stack<>();
	}

	public void push(int x) {
		s1.push(x);
	}

	public int pop() {
		if(!s2.isEmpty())
		{
			return s2.pop();
		}
		else if(!s1.isEmpty()){
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			return s2.pop();
		}else{
			return -1;
		}
	}

	public int peek() {
		if(!s2.isEmpty())
		{
			return s2.peek();
		}
		else if(!s1.isEmpty()){
			while(!s1.isEmpty())
			{
				s2.push(s1.pop());
			}
			return s2.peek();
		}else{
			return -1;
		}
	}

	public boolean empty() {
		return s1.isEmpty() && s2.isEmpty();
	}}
