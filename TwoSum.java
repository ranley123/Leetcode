/**
 * @id: 2
 * @author ranley
 * @level: middle
 * @runtime: 5ms, faster than 95.5%
 */
public class TwoSum {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode h1 = l1;
		ListNode h2 = l2;
		ListNode res = null;
		ListNode hres = res;
		int carry = 0;
		
		while(l1 != null && l2 != null) {
			int temp = l1.val + l2.val + carry;
			ListNode newNode = new ListNode(temp%10);
			carry = temp/10;

            if(res == null){
                res = newNode;
                hres = res;
            }
            else{
                res.next = newNode; 
                res = res.next;  
            }
            l1 = l1.next;
			l2 = l2.next;
		}
		while(l1 != null) {
			int temp = l1.val + carry;
			ListNode newNode = new ListNode(temp%10);
			carry = temp/10;
			res.next = newNode;
			res = res.next;
			l1 = l1.next;
            
		}
		while(l2 != null) {
			int temp = l2.val + carry;
			ListNode newNode = new ListNode(temp%10);
			carry = temp/10;
			res.next = newNode;
			res = res.next;
			l2 = l2.next;
            
		}
		
		if(carry == 1) {
			res.next = new ListNode(1);
			res = res.next;
		}
		return hres;
	}
	public static void main(String [] args) {
		System.out.println("df");

	}

}
