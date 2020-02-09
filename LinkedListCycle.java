/*
 * id: 141
 */
public class LinkedListCycle {
	public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (slow == fast) {
                break;
            }
        }

        return !(fast == null || fast.next == null);
    }
}
