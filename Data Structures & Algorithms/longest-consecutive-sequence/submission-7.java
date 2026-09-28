class Solution {
    public int longestConsecutive(int[] nums) {
        int maxlength = 0;
        int currlength = 0;
        HashSet<Integer> h = new HashSet<>();
        for(int num: nums){
            h.add(num);
        }
        for(int i=0; i<nums.length; i++){
            if(!h.contains(nums[i]-1)){//potential start of sequence
                currlength = 0;
                while(h.contains(nums[i]+currlength)){
                    currlength++;
                }
                maxlength = Math.max(maxlength,currlength);
            }
        }
        return maxlength;
    }
}
