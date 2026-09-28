class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> h = new HashMap<>(); 
        //frequency, integers that have that frequency
        List<Integer>[] count = new List[nums.length + 1];
        for(int i=0; i<count.length; i++){
            count[i] = new ArrayList<>();
        }
        for(int num : nums){
            h.put(num,(h.getOrDefault(num,0))+1);
        }
        for(int num:h.keySet()){
            count[h.get(num)].add(num);
        }
        int[] res = new int[k];
        int index = 0;
        for (int i = count.length - 1; i > 0 && index < k; i--) {
            for (int n : count[i]) {
                res[index++] = n;
                if (index == k) {
                    return res;
                }
            }
        }
        return res;

        

        

    }
}
