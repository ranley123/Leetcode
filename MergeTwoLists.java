/*
 * id: 21
 */
public class MergeTwoLists {
	/**
	 * Definition for singly-linked list. public class ListNode { int val; ListNode
	 * next; ListNode(int x) { val = x; } }
	 */

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode resultHead = new ListNode(0);

		if (l1 == null) {
			return l2;
		}
		if (l2 == null) {
			return l1;
		}

		if (l1.val < l2.val) {
			resultHead.val = l1.val;
			resultHead.next = mergeTwoLists(l1.next, l2);
		} else {
			resultHead.val = l2.val;
			resultHead.next = mergeTwoLists(l1, l2.next);
		}
		return resultHead;

	}

}
