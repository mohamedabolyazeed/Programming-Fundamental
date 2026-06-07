class Solution:
    def twoSum(self, nums, target):
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    return [i, j]
        return []

def main():
    solution = Solution()
    
    nums = list(map(int, input("Enter numbers separated by spaces: ").split()))
    target = int(input("Enter target sum: "))
    
    result = solution.twoSum(nums, target)
    print(f"Indices: {result}")

if __name__ == "__main__":
    main()