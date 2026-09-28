class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> h = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            h.add(nums[i]);
        }
        return !(nums.length==h.size());
        
    }
}