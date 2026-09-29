class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        # 1. count each number in a dict
        h = {}
        for num in nums:
            h[num] = h.get(num,0)+1
        
        # 2. make buckets: index = count, value = list of nums
        arr = []
        for i in range(len(nums) + 1):
            arr.append([])
        
        # 3. fill buckets from the dict
        for num,count in h.items():
            arr[count].append(num)


        # 4. walk buckets from the end, collect until we have k
        ans = []
        for n in range(len(arr)-1, 0,-1):
            for num in arr[n]:
                ans.append(num)
                if len(ans)==k:
                    return ans
        return ans

        

