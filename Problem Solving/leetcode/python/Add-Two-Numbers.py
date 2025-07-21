# Problem Description:
# You are given two non-empty linked lists representing two non-negative integers.
# The digits are stored in reverse order, and each of their nodes contains a single digit.
# Add the two numbers and return the sum as a linked list.
# You may assume the two numbers do not contain any leading zero, except the number 0 itself.
#
# Example:
# Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
# Output: 7 -> 0 -> 8
# Explanation: 342 + 465 = 807
#
# ----------------------------
# Detailed Explanation of the Solution:
# We create a dummy node to simplify the linked list construction.
# We iterate through both input linked lists (l1 and l2) as long as there are nodes or there's a carry.
# At each step, we:
#   - Take the value from the current node of l1 and l2 (0 if the node is None).
#   - Add those values together with any carry from the previous step.
#   - Calculate the new digit (total % 10) and update carry (total // 10).
#   - Create a new node with the calculated digit and append it to the result list.
#   - Move to the next nodes in l1 and l2.
# After the loop, the dummy node’s next pointer will point to the head of the resulting sum list.

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def addTwoNumbers(self, l1, l2):
        dummy = ListNode()
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            val1 = l1.val if l1 else 0
            val2 = l2.val if l2 else 0

            total = val1 + val2 + carry
            carry = total // 10

            current.next = ListNode(total % 10)
            current = current.next

            if l1:
                l1 = l1.next
            if l2:
                l2 = l2.next

        return dummy.next

def build_linked_list(nums):
    dummy = ListNode()
    current = dummy
    for num in nums:
        current.next = ListNode(num)
        current = current.next
    return dummy.next

def linked_list_to_list(node):
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

import ast

l1_input = input("first number: ")  # ex: [2, 4, 3]
l1_nums = ast.literal_eval(l1_input)

l2_input = input("second number: ")  # ex: [5, 6, 4]
l2_nums = ast.literal_eval(l2_input)

l1 = build_linked_list(l1_nums)
l2 = build_linked_list(l2_nums)

solution = Solution()
result = solution.addTwoNumbers(l1, l2)

print("Result as list:", linked_list_to_list(result))