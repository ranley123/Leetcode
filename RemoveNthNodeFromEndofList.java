/**
 * @id 19
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class RemoveNthNodeFromEndofList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        if(head.next == null) return null;
        while(n > 0 && fast != null){
            fast = fast.next;
            n--;
        }
        if(fast == null){
            head = head.next;
            return head;
        }
        while(fast != null && fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
