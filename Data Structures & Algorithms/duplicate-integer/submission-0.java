class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> h = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            h.add(nums[i]);
        }
        return h.size()!=nums.length;
 
    }
}
