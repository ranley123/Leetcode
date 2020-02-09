/**
 * @id 328
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class OddEvenLinkedList {
    public ListNode oddEvenList(ListNode head) {
    	if(head == null || head.next == null)
            return head;
        ListNode pre = head;
        ListNode cur = head.next;
        
        while(cur != null && cur.next != null){
            ListNode tmp = pre.next;
            pre.next = cur.next;
            cur.next = pre.next.next;
            pre.next.next = tmp;
            pre = pre.next;
            cur = cur.next;
        }
        return head;
    }
}
