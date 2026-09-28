class Solution {
    public int longestConsecutive(int[] nums) {
        /*
        note: can't sort
        approach:
        make a hashset
        iterate through the array
        check if n-1 exists in the hashset
        */

        HashSet<Integer> h = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            h.add(nums[i]);
        }
        int longest = 0;
        int length;
        for(int i=0; i<nums.length; i++){
            if(h.contains(nums[i]-1)){
                continue;
            }
            else{ // found start of sequence
                length = 0;
                while(h.contains(nums[i]+length)){
                    length++;
                }
                longest = Math.max(length,longest);
            }
        }
        return longest;
        
    }
}
