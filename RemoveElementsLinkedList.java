/*
 * id: 203
 * runtime: 1ms faster than 98%
 */
public class RemoveElementsLinkedList {
	public ListNode removeElements(ListNode head, int val) {
        if(head == null)
            return head;
        ListNode cur = head;
        ListNode dummy = new ListNode(0);
        ListNode pre = dummy;
        dummy.next = head;
        while(pre.next != null){
            cur = pre.next;
            if(cur.val == val){
                pre.next = cur.next;
            }
            else
                pre = pre.next;
        }
        return dummy.next;
    }
}
