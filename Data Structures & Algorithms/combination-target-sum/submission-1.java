class Solution {
    public List<List<Integer>> output = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] nums, int target) {
        dfs(nums, new ArrayList<>(), target, 0);
        return output;
    }

    public void dfs(int[] nums, List<Integer> combination, int target, int startIndex) {
        if (target < 0) {
            return;
        } else if (target == 0) {
            output.add(new ArrayList<>(combination));
            return;
        }

        for (int i = startIndex; i < nums.length; i++) {
            combination.add(nums[i]);
            dfs(nums, combination, target - nums[i], i); // not i + 1, because elements can be reused
            combination.remove(combination.size() - 1);
        }
    }
}
