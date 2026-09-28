class Solution {
    public int findMin(int[] nums) {
        int l = 0;
        int r = nums.length-1;
        while(l<r){
            int m = (l+r)/2;
            if(nums[m]>nums[r]){ //the number is on the right
                l = m+1;
            }
            else { //the number is on the left
                r = m;
            }
            
        }
        return nums[l];
        
    }
}
