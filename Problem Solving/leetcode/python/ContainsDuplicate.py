# input1 = [1, 2, 3, 1]
# input2 = [1, 2, 3, 4]
# class Solution:
#     def containsDuplicate(self, nums):
#         nums.sort()
#         for i in range(1, len(nums)):
#             if nums[i] == nums[i - 1]:
#                 return True
#         return False

# sol = Solution()
# print(sol.containsDuplicate(input1))
# print(sol.containsDuplicate(input2))

class Solution:
    nums = [1, 2 ,3 , 1]
    def containsDuplicate(self, nums):
        hash_set = set()
        for n in nums:
            if n in hash_set:
                return True
            hash_set.add(n)
        return False

sol = Solution()
print(sol.containsDuplicate(sol.nums))