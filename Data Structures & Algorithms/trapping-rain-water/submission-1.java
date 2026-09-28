class Solution {
    public int trap(int[] height) {
    /*
    the amount of water able to be trapped on top of any given block 
    is given by the height of the tallest wall to the right and to the left
    minus the height of that block
    */
        int[] preMax = new int[height.length];
        int[] postMax = new int[height.length];
        int pre = 0;
        int post = 0;
        int output = 0;
        int cur = 0;

        for(int i=0; i<height.length; i++){
            preMax[i] = pre;
            pre = Math.max(pre,height[i]);
        }
        for(int i=height.length-1; i>=0; i--){
            postMax[i] = post;
            post = Math.max(post,height[i]);
        }
        for(int i=0; i<height.length; i++){
            cur=Math.min(postMax[i],preMax[i]);
            cur-=height[i];
            if(cur>0) output+=cur;
        }
        return output;
    }
}
