<<<<<<< HEAD
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
=======
class Solution {
public:
    ListNode* insertionSortList(ListNode* head) {
        ListNode* newHead = NULL;
        while(head){
            ListNode* temp = head;
            head = head->next;
            temp->next=NULL;
            
            if(newHead == NULL) newHead = temp;
            else if(newHead->val >= temp->val){
                temp->next = newHead;
                newHead = temp;
            }
            else{
                ListNode* root = newHead;
                {
                while(root->next){
                    if(temp->val > root->val and temp->val <= root->next->val){
                        temp->next = root->next;
                        root->next = temp;
                        break;
                    }
                    root = root->next;
                }  
                    if(root->next==NULL) root->next = temp;
                    
                }
            }
        }
        return newHead;
    }
};
>>>>>>> c7944f4e3f28feb236514f5e82086b93bebe7b9c
