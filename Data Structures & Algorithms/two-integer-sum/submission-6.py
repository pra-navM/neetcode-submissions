class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hash = {}
        for i,n in enumerate(nums):
            hash[n] = i
        for i,n in enumerate(nums):
            d = target-n
            if d in hash and hash[d]!=i :
                return [i,hash[d]]
        return []



        