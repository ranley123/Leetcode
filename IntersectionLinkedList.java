/*
 * id: 160
 * runtime: 1ms faster than 100%
 */
public class IntersectionLinkedList {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null){
            return null;
        }
        
        ListNode ha = headA;
        ListNode hb = headB;
        
        while(ha != null && hb != null){
            ha = ha.next;
            hb = hb.next;
        }
        
        ListNode runnerA = headA;
        ListNode runnerB = headB;
        
        if(ha != null){
            while(ha != null){
                runnerA = runnerA.next;
                ha = ha.next;
            }
        }
        if(hb != null){
            while(hb != null){
                runnerB = runnerB.next;
                hb = hb.next;
            }
        }
        
        while(runnerA != runnerB){
            runnerA = runnerA.next;
            runnerB = runnerB.next;
        }
        
        return runnerA;
		
		/*
		if (headA == null || headB == null){
            return null;
        }
        
        // firstly, we need to find the tail of A
        ListNode ha = headA;
        ListNode ta = headA;
        ListNode fast = headA;
        ListNode slow = headA;
        
        while (ha.next != null){
            ha = ha.next;
        }
        ta = ha;
        
        // secondly, we put the headB at the tailA
        ta.next = headB;
        //if there is a cycle inside, then we know the intersection exists
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                break;
            }
        }
        if(fast == null || fast.next == null){
            ta.next = null;
            return null;
        }*/
        
        /*
        * so we need to find the intersection point which can be transformed into a mathematical problem
        * let the length of the path from the beginning to the entry of the circle is x meters; the circumference of the cycle is l meters; the fast node moves 2m/s, while the slow one moves 1m/s. We want to find the distance from the intersection point to the entry point.
        * When the slow node comes to the entry, it spent (x/1) seconds, while the fast node is already (x) m ahead in the circle, which means if the fast node wants to chase after the slow one, it needs to go more (l-x) m.
        * so the time it costs is (l-x)/(2-1), and the intersection point is 1*(l-x) meters.
        * so in the programming context, we put slow node again at the headA, and then let two nodes move 1m/s, when they intersects again, then the point is the entry
        */
		/*
        slow = headA;
        while(slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        ta.next = null;
        return slow;*/
    }
}
