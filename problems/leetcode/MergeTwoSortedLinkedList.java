package leetcode;

import LinkedList.LinkedList;

public class MergeTwoSortedLinkedList {

	public LinkedList mergeTwoLists(LinkedList list1, LinkedList list2) {
		if(list1 == null) return list2;
		if(list2 == null) return list1;
		LinkedList result = new LinkedList(-1);
		LinkedList head = result;
		while(list1 != null && list2 != null)
		{
			if(list1.val < list2.val)
			{
				result.next = list1;
				list1 = list1.next;
			}
			else
			{
				result.next = list2;
				list2 = list2.next;
			}
			result = result.next;
		}
		result.next = list1 == null ? list2 : list1;
		return head.next;


	}

}
