/*
 * id: 707
 */
public class MyLinkedList {
	//define the ListNode class
    public class ListNode {
        public int val;
        public ListNode next;
        public ListNode (int val) {
            this.val = val;
            this.next = null;
        }
        public ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    /** Initialize your data structure here. */
    public ListNode head;
    
    public MyLinkedList() {
        head = null;
    }
    
    /* Return the length of the linked list*/
    public int getLength() {
        if (head == null) return 0;

        ListNode temp = head;
        int count = 0;

        while (temp != null) {
        temp = temp.next;
        count++;
        }
        return count;
    }
    
    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if (head == null) return -1;
        if (index > getLength() - 1 || index < 0) return -1;
        
        ListNode temp = head;
        for (int i =0; i < index; i++){
            temp = temp.next;
        }
        if (temp == null) return -1;
        return temp.val;
    }
    
    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        ListNode temp = new ListNode (val, head);
        head = temp;
    }
    
    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {
        ListNode temp = new ListNode(val);
        if (head == null){
            head = temp;
        }
        else{
            ListNode cur = head;
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = temp;
        }
    }
    
    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {
        ListNode temp = new ListNode(val);

        if (index == getLength()) {
            addAtTail(val);
        } else if (index < getLength()) {
            int counter = 1;
            ListNode cur = head;
            while (cur != null) {
                if (counter == index) {
                    temp.next = cur.next;
                    cur.next = temp;
                    break;
                } else {
                    cur = cur.next;
                    counter++;
                }
            }
        }
    }
    
    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
         if (index  < getLength()) {
            ListNode temp = head;

            int counter = 1;
            while(temp != null) {
            if (counter < index) {
                temp = temp.next;
                counter++;

            } else if (counter == index) {
                temp.next = temp.next.next;
                break;
            }
            }
        }
    }
}
