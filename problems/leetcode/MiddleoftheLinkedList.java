package leetcode;

import LinkedList.LinkedList;

public class MiddleoftheLinkedList {
	public LinkedList middleNode(LinkedList head) {
		LinkedList slow = head;
		LinkedList fast = head;
		while(fast!= null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
}
