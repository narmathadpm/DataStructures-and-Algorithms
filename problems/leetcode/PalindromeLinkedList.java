package leetcode;

import LinkedList.LinkedList;

public class PalindromeLinkedList {
	public boolean isPalindrome(LinkedList head) {

		if (head != null) {
			LinkedList middle = findMiddle(head);
			LinkedList reverseNode = reverse(middle);
			while (head != null && reverseNode != null) {
				System.out.println(head.val);
				System.out.println(reverseNode.val);
				if (head.val != reverseNode.val) {
					return false;
				}
				head = head.next;
				reverseNode = reverseNode.next;

			}
			return true;
		}
		return false;

	}

	public LinkedList findMiddle(LinkedList head) {
		LinkedList slow = head;
		LinkedList fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	public LinkedList reverse(LinkedList head) {
		LinkedList prev = null;
		LinkedList current = head;
		while (current != null) {
			LinkedList temp = current.next;
			current.next = prev;
			prev = current;
			current = temp;
		}
		return prev;
	}
}
