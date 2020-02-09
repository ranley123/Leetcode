/*
 * id: 234
 * time O(n) space O(1)
 */
public class PalindromeLinkedList {
	 public boolean isPalindrome(ListNode head) {
		 if(head == null || head.next==null)
		        return true;
		 
		    //find list center
		    ListNode fast = head;
		    ListNode slow = head;
		 
		    while(fast!=null && fast.next!=null){
		        fast = fast.next.next;
		        slow = slow.next;
		    }
		 
		    ListNode secondHead = slow;
		    slow.next = null;
		 
		    //reverse second part of the list
		    ListNode p1 = secondHead;
		    ListNode p2 = p1.next;
		 
		    while(p1!=null && p2!=null){
		        ListNode temp = p2.next;
		        p2.next = p1;
		        p1 = p2;
		        p2 = temp;
		    }
		 
		    secondHead.next = null;
		 
		    //compare two sublists now
		    ListNode p = (p2==null?p1:p2);
		    ListNode q = head;
		    while(p!=null){
		        if(p.val != q.val)
		            return false;
		 
		        p = p.next;
		        q = q.next;
		 
		    }
		 
		    return true;
	    /*
	     * recursive may cost more time
	     * public ListNode reverseList(ListNode head){
	        if (head == null){
	            return null;
	        }
	        if (head.next == null){
	            return head;
	        }
	        
	        ListNode temp = head.next;
	        ListNode newHead = reverseList(temp);
	        
	        temp.next = head;
	        head.next = null;
	        
	        return newHead;
	    }
	     */
	 }   
}
