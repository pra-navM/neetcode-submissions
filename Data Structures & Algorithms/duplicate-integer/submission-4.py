class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        freqs = {}
        for num in nums:
            freqs[num] = freqs.get(num,0)+1
            if freqs[num] > 1:
                return True
        return False
        