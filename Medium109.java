public TreeNode sortedListToBST(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null) // the best case: only one node. Otherwise, never ending
            return new TreeNode(head.val);
        ListNode mid = findMiddleElement(head);
        TreeNode node = new TreeNode(mid.val);
        node.left = sortedListToBST(head);
        node.right = sortedListToBST(mid.next);
        return node;
    }
    
    private ListNode findMiddleElement(ListNode head){
        if (head == null)
            return null;
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null; // to disconnect
        
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        if (prev != null)
            prev.next = null;
        return slow;
    }