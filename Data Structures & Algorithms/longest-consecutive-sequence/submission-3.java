class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        else{
            Set <Integer> h = new HashSet<>();
            for(int num : nums){
                h.add(num);
            }
            
            int maxstreak=0;
            for(int num : nums){
                if(!(h.contains(num-1))){ //start of a sequence
                    int currentstreak=0;
                    while(h.contains(num+currentstreak)){
                        currentstreak++;
                    }
                    if(currentstreak>maxstreak) maxstreak=currentstreak;
                }
            }
            return maxstreak;
        }

        
    }
}
