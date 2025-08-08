class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def insertionSortList(self, head: ListNode) -> ListNode:
        if not head or not head.next:
            return head
        
        sorted_head = None
        
        while head:
            curr = head
            head = head.next
            curr.next = None
            
            if not sorted_head or curr.val <= sorted_head.val:
                curr.next = sorted_head
                sorted_head = curr

            else:
                temp = sorted_head
                while temp.next and temp.next.val < curr.val:
                    temp = temp.next
                curr.next = temp.next
                temp.next = curr
        
        return sorted_head
