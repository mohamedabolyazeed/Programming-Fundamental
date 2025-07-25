class Solution(object):
    def addBinary(self, a, b):
        result = []
        carry = 0

        i, j = len(a) - 1, len(b) - 1

        while i >= 0 or j >= 0 or carry:
            total = carry

            if i >= 0:
                total += int(a[i])
                i -= 1
            if j >= 0:
                total += int(b[j])
                j -= 1

            result.append(str(total % 2))
            carry = total // 2

        return ''.join(reversed(result))

sol = Solution()
print(sol.addBinary("11", "1"))
print(sol.addBinary("1010", "1011")) 
