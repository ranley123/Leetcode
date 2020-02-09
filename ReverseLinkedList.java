/*
 * id: 206
 * runtime: 0ms faster than 100%
 */
public class ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
        if(head == null)
            return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = head;
        ListNode next = head.next;
        
        while(next != null){
            cur.next = next.next;
            next.next = dummy.next;
            dummy.next = next;
            
            next = cur.next;
        }
        return dummy.next;
    }
}
