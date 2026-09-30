class Solution:
    def canJump(self, nums: List[int]) -> bool:
        memo = {} #num, bool

        def dfs(i):
            if i>=len(nums)-1:
                return True
            if i in memo:
                return memo[i]
            for n in range(nums[i]):
                if dfs(i+n+1):
                    memo[i] = True
                    return True
            memo[i] = False
            return False
        return dfs(0)