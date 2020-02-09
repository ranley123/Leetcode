/**
 * @id 92
 * @author ranley
 * @level middle
 * @runtime 0ms faster than 100%
 */
public class ReverseLinkedList2 {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (head == null || head.next == null || m >= n) {
            return head;
        }

        ListNode dummyNode = new ListNode(0);
        dummyNode.next = head;
        head = dummyNode;

        ListNode pre = head; // pre node

        for (int i = 1; i < m; i++) {
            pre = pre.next;
        }

        ListNode cur = pre.next;
        ListNode next = pre.next.next;
        ListNode temp = next;
        
        for(int i = 0; i < n - m; i++){
            cur.next = next.next;
            next.next = pre.next;
            pre.next = next;
            
            next = cur.next;
        }
        return dummyNode.next;
    }
}
