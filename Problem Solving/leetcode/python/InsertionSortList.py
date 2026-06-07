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

def printList(head):
    current = head
    while current:
        print(current.val, end=" -> ")
        current = current.next
    print("None")

def main():
    solution = Solution()
    
    values = list(map(int, input("Enter list values separated by spaces: ").split()))
    
    if not values:
        print("Empty list")
        return
    
    head = ListNode(values[0])
    current = head
    for val in values[1:]:
        current.next = ListNode(val)
        current = current.next
    
    print("Original list:")
    printList(head)
    
    sorted_head = solution.insertionSortList(head)
    
    print("Sorted list:")
    printList(sorted_head)

if __name__ == "__main__":
    main()