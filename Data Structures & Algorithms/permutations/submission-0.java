
class Solution {
    public List<List<Integer>> out = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        ArrayList<Integer> word = new ArrayList<>();
        for (int num : nums) {
            word.add(num);
        }
        dfs(word, new ArrayList<>(), 0);
        return out;
    }

    public void dfs(ArrayList<Integer> word, ArrayList<Integer> current, int movingIndex) {
        if (movingIndex == word.size()) {
            out.add(new ArrayList<>(current));
            return;
        }

        int insert = word.get(movingIndex);
        for (int i = 0; i <= current.size(); i++) {
            current.add(i, insert);
            dfs(word, current, movingIndex + 1);
            current.remove(i); // remove by index, not value
        }
    }
}
