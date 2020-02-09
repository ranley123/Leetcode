import java.util.Stack;

/**
 * @id 445
 * @author ranley
 * @level middle
 * @runtime 2ms faster than 98.17%
 */
public class AddTwoNumbers2 {
	// method 1: using stack to store values
//	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        Stack<Integer> stack1 = new Stack<>();
//        Stack<Integer> stack2 = new Stack<>();
//        ListNode head1 = l1;
//        ListNode head2 = l2;
//        while(head1 != null){
//            stack1.push(head1.val);
//            head1 = head1.next;
//        }
//        while(head2 != null){
//            stack2.push(head2.val);
//            head2 = head2.next;
//        }
//        
//        int carry = 0;
//        ListNode head = null;
//        while(!stack1.isEmpty() && !stack2.isEmpty()){
//            int sum = stack1.pop() + stack2.pop();
//            ListNode temp = new ListNode((sum + carry) % 10);
//            carry = (sum + carry) / 10;            
//            temp.next = head;
//            head = temp;
//        }
//        while(!stack1.isEmpty()){
//            int sum = (stack1.pop() + carry);
//            ListNode temp = new ListNode(sum % 10);
//            carry = sum / 10;
//            temp.next = head;
//            head = temp;
//        }
//        
//        while(!stack2.isEmpty()){
//            int sum = (stack2.pop() + carry);
//            ListNode temp = new ListNode(sum % 10);
//            carry = sum / 10;
//            temp.next = head;
//            head = temp;
//        }
//        
//        if(carry == 1){
//            ListNode temp = new ListNode(1);
//            temp.next = head;
//            head = temp;
//        }
//        return head;
//    }
	
	// method 2: using recursive
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int len1 = 0, len2 = 0;
        ListNode head1 = l1, head2 = l2;
        int carry = 0;
        while(head1 != null){
            len1++;
            head1 = head1.next;
        }
        while(head2 != null){
            len2++;
            head2 = head2.next;
        }
        if(len1 >= len2){
            carry = helper(l1, l2, len1, len2); 
        }
        else
            carry = helper(l2, l1, len2, len1);
        ListNode temp = len1 >= len2 ? l1 : l2;
        if(carry == 1){
            temp = new ListNode(1);
            temp.next = len1 >= len2 ? l1 : l2;
        }
        return temp;
    }
    // return carry
    private int helper(ListNode l1, ListNode l2, int len1, int len2){
        if(len1 == 0 || len2 == 0)
            return 0;
        int carry = 0;
        if(len1 > len2){
            carry = helper(l1.next, l2, len1 - 1, len2);
            int sum = l1.val + carry;
            l1.val = sum % 10;
            return sum / 10;
        }
        else if(len1 == len2){
            carry = helper(l1.next, l2.next, len1 - 1, len2 - 1);
            int sum = l1.val + l2.val + carry;
            l1.val = sum % 10;
            return sum / 10;
        }
        return 0;
    }
}
