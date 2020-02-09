/**
 * @id 19
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class SwopPairs {
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while(temp.next != null && temp.next.next != null) {
            ListNode start = temp.next;
            ListNode end = temp.next.next;
            temp.next = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return dummy.next;
    }
}
