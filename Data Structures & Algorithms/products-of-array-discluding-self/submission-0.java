class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] pre = new int[nums.length];
        int[] post = new int[nums.length];
        int[] output = new int[nums.length];
        int preprod = 1;
        int postprod = 1;
        for(int i=0; i<nums.length; i++){
            pre[i] = preprod;
            preprod*=nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            post[i] = postprod;
            postprod*=nums[i];
        }
        for(int i=0; i<nums.length; i++){
            output[i] = pre[i]*post[i];
        }
        return output;
    }
}  
