/**
 * @id 61
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class RotateList {
	public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
            return head;
        ListNode fast = head;
        ListNode slow = head;
        ListNode cur = head;
        int counter = 0;
        while(cur != null){
            cur = cur.next;
            counter++;
        }

        k = k % counter;
        while(k > 0){
            k--;
            fast = fast.next;
        }
        
        while(fast.next != null){
            fast = fast.next;
            slow = slow.next;
        }
        if(fast == slow)
            return head;
        
        ListNode temp = slow.next;
        slow.next = null;
        fast.next = head;
        return temp;
    }
}
