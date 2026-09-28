class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        Arrays.sort(nums);
        int j,k;
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]>0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            j=i+1;
            k = nums.length-1;
            while(k>j){
                if((nums[i]+nums[j]+nums[k])>0){
                    k--;
                }
                else if ((nums[i]+nums[j]+nums[k])<0){
                    j++;
                }
                else{
                    List<Integer> arr1 = new ArrayList<>();
                    arr1.add(nums[i]);
                    arr1.add(nums[j]);
                    arr1.add(nums[k]);
                    output.add(arr1);
                    while (j < k && nums[j] == nums[j + 1]) j++;
                    while (j < k && nums[k] == nums[k - 1]) k--;
                    j++;
                    k--;
                }
            }
        }
        return output;     
        
    }
}
