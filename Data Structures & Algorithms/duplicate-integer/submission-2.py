class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        set1 = set();

        for i in range(len(nums)):
            set1.add(nums[i])

        return len(set1)!=len(nums)

        