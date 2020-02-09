/**
 * @id 86
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class PartitionList {
	public ListNode partition(ListNode head, int x) {
        ListNode h1 = new ListNode(-1); // smaller, dummy head
        ListNode h2 = new ListNode(-1); // larger
        ListNode cur1 = h1;
        ListNode cur2 = h2;
        
        ListNode cur = head;
        while(cur != null){
            if(cur.val < x){
                cur1.next = cur;
                cur1 = cur1.next;
            }
            else{
                cur2.next = cur;
                cur2 = cur2.next;
            }
            cur = cur.next;
        }
        cur1.next = h2.next;
        cur2.next = null;
        return h1.next;
    }
}
