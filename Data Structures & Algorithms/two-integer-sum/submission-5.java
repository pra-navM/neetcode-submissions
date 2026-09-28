class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> h = new HashMap<Integer,Integer>();
        int[] out =  new int[2];
        for(int i=0; i<nums.length; i++){
            h.put(nums[i],i);
        }
        for(int i=0; i<nums.length; i++){
            if(h.containsKey(target-nums[i]) && (h.get(target-nums[i]) != i)){
                if(i<h.get(target-nums[i])){
                    out[0] = i;
                    out[1] = h.get(target-nums[i]); 
                }
                else{
                    out[1] = i;
                    out[0] = h.get(target-nums[i]);
                }
            }
        }
        return out;
        
    }
}
