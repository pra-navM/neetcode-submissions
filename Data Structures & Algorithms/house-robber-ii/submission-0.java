class Solution {
    public int rob(int[] nums) {
        int rob1 = 0;
        int rob2 = 0;
        int rob3 = 0;

        if(nums.length==1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }
        if(nums.length==3){
            return Math.max(Math.max(nums[0],nums[1]),nums[2]);
        }

        // case 1: rob the first house
        rob1 = robcheck(nums);
        // case 2: rob the second house
        int[] arr2 = new int[nums.length];
        for(int i=0; i<nums.length-1; i++){
            arr2[i] = nums[i+1];
        }
        arr2[nums.length-1] = nums[0];
        rob2 = robcheck(arr2);
        // case 3: rob the third house
        int[] arr3 = new int[nums.length];
        for(int i=0; i<nums.length-2; i++){
            arr3[i] = nums[i+2];
        }
        arr2[nums.length-2] = nums[0];
        arr2[nums.length-1] = nums[1];
        rob3 = robcheck(arr3);

        return Math.max(Math.max(rob1,rob2),rob3);
    }

    public int robcheck(int[] nums){
        int[] max = new int[nums.length];
        max[0] = nums[0];
        max[1] = nums[0];
        for(int i=2; i<nums.length; i++){
            max[i] = Math.max(max[i-1],max[i-2]+nums[i]);
        }
        return max[nums.length-2];
    }
}
