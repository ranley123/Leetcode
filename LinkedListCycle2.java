/**
 * @id 142
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class LinkedListCycle2 {
	public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast){
                ListNode temp = head;
                System.out.println(slow.val);
                while(slow != temp){
                    slow = slow.next;
                    temp = temp.next;
                }
                return slow;
            }
        }
        return null;
    }
}
