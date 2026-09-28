class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] out = new int[2];
        HashMap<Integer, Integer> h = new HashMap<>();
        for(int i=0; i< numbers.length; i++){
            h.put(numbers[i],i);
        }

        for(int i=0; i<numbers.length; i++){
            if(h.containsKey(target - numbers[i]) && i!=h.get(target - numbers[i])){
                out[0] = h.get(target - numbers[i]);
                out[1] = i;
                break;
            }
        }
        if(out[0]>out[1]){
            int temp = 0;
            temp = out[1];
            out[1] = out[0] + 1;
            out[0] = temp + 1;
        }
        return out;

        


        
    }
}
