package leetcode;

import LinkedList.LinkedList;

public class ReverseLinkedList {
	public LinkedList reverseList(LinkedList head) {
		LinkedList prev = null;
		LinkedList current = head;
		while(current != null)
		{
			LinkedList temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
