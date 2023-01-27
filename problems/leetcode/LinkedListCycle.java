package leetcode;
import LinkedList.LinkedList;

public class LinkedListCycle {
	public boolean hasCycle(LinkedList head) {
		LinkedList slow =  head;
		LinkedList fast = head;
		while(fast != null && fast.next != null)
		{
			fast = fast.next.next;
			slow = slow.next;
			if(fast == slow)
			{
				return true;
			}
		}
		return false;
	}
}
