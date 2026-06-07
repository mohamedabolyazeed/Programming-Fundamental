class Solution:
    nums = [0,1,2,2,3,0,4,2]
    val = 2
    def removeElement(self, nums, val):
        i = 0
        for x in nums:
            if x != val:
                nums[i] = x
                i += 1
        return i

sol = Solution()
print(sol.removeElement(sol.nums, sol.val))
print(sol.nums)