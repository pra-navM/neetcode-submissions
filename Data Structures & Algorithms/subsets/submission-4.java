class Solution {
    public List<List<Integer>> H = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        ArrayList<Integer> ongoing = new ArrayList<>();
        DFS(nums, 0, ongoing);
        return H;
    }
    public void DFS(int[] nums, int index, ArrayList<Integer> ongoing){
        if(index==nums.length){
            H.add(new ArrayList<>(ongoing));
            return;
        }
        DFS(nums, index+1, ongoing);
        ongoing.add(nums[index]);
        DFS(nums, index+1, ongoing);
        ongoing.remove(ongoing.size()-1);
        return;
    }

}
