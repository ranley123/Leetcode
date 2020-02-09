class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None
        
def mergeTwoLists(l1, l2):
    head = ListNode(0)
    cur = head
    
    while l1 != None and l2 != None:
        if l1.val >= l2.val:
            cur.next = l2
            l2 = l2.next
        else:
            cur.next = l1
            l1 = l1.next
        cur = cur.next
        
    if l1 != None:
        cur.next = l1
    else:
        cur.next = l2
    return head.next

