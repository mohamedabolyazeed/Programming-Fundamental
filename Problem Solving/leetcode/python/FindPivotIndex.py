class Solution:
    def pivotIndex(self, nums):
        leftSum = 0
        rightSum = sum(nums)
        for i in range(len(nums)):
            rightSum -= nums[i]
            if leftSum == rightSum:
                return i
            leftSum += nums[i]
        return -1
nums = [1, 7, 3, 6, 5, 6]      
sol = Solution()
print(sol.pivotIndex(nums))